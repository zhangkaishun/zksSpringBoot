package com.zks.zksspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zks.zksspringboot.example.*.mapper")
public class ZksspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZksspringbootApplication.class, args);
	}
}
