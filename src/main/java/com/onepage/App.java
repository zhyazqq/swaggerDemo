package com.onepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
//import com.onepage.swagger.EnableZQQSwagger;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableZQQSwagger 第一种界面注释  如需开启  请把下面两个注释
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}

}
