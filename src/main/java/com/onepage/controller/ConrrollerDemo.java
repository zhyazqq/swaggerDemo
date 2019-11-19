package com.onepage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api("demo")
public class ConrrollerDemo {
	@ApiOperation(value = "获取")
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	public void name() {
		for (int i = 0; i < 10; i++) {
			System.out.println("111111");
		}
	}

}
