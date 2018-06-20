package com.sn.esp.sunuCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class SunuCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunuCityApplication.class, args);
	}
}
