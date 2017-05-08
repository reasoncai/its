package com.jiuair.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import javax.sql.DataSource;

/**
 * 基础数据源配置
 * Created by reason on 17/5/5.
 */
@Configuration
@MapperScan(basePackages = BaseDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "baseSqlSessionFactory")
public class BaseDataSourceConfig {
    // 精确到 base 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.jiuair.dao.base";
    private static final String MAPPER_LOCATION = "classpath:mapper/base/*.xml";
    private static final String CONFIG_LOCATION = "mybatis.xml";

    @Value("${base.datasource.url}")
    private String url;

    @Value("${base.datasource.username}")
    private String user;

    @Value("${base.datasource.password}")
    private String password;

    @Value("${base.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "baseDataSource")
    @Primary
    public DataSource masterDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "baseTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

    @Bean(name = "baseSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("baseDataSource") DataSource masterDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setConfigLocation(new ClassPathResource(BaseDataSourceConfig.CONFIG_LOCATION));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(BaseDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}

