package com.jiuair;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiuair.dao")
public class ItsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsApplication.class, args);
	}
}
