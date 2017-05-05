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
 * Pss数据源配置
 * Created by reason on 17/5/5.
 */
@Configuration
@MapperScan(basePackages = PssDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "pssSqlSessionFactory")
public class PssDataSourceConfig {
    // 精确到 base 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.jiuair.dao.pss";
    private static final String MAPPER_LOCATION = "classpath:mapper/pss/*.xml";
    private static final String CONFIG_LOCATION = "mybatis.xml";

    @Value("${pss.datasource.url}")
    private String url;

    @Value("${pss.datasource.username}")
    private String user;

    @Value("${pss.datasource.password}")
    private String password;

    @Value("${pss.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "pssDataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "pssTransactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "pssSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("pssDataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new ClassPathResource(PssDataSourceConfig.CONFIG_LOCATION));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(PssDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

