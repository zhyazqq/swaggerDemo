//package com.onepage.swagger;
//
//import org.springframework.context.annotation.Import;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.lang.annotation.*;
//
///**
// * Created by liuhuan on 2018/7/20 9:47.
// */
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE})
//@Documented
//@EnableSwagger2
//@Import({HuanSwagger.class})
//public @interface EnableZQQSwagger {
//}
//自定义注解  如使用第一种界面 这个放开   访问路径：第一个访问路径：http://localhost:8080/webjars/swagger-ui/index.html 这个ui文件等在resources下      第二个访问路径：http://localhost:8080/doc.html 这个默认封装在jar里面 ui不在resources下面
//第二个界面可以导出markdown 第一个不可以   但是第一个界面好看
//第一个界面依赖：
/*
 *  <dependency>
          <groupId>io.springfox</groupId>
          <artifactId>springfox-swagger2</artifactId>
          <version>2.9.2</version>
      </dependency>
 * 
 * */
//第二个界面访问依赖
/*
 * 
 *  <dependency>
          <groupId>io.springfox</groupId>
          <artifactId>springfox-swagger2</artifactId>
          <version>2.9.2</version>
      </dependency>

  <dependency>
            <groupId>com.github.xiaoymin</groupId>
            <artifactId>swagger-bootstrap-ui</artifactId>
            <version>1.9.6</version>
        </dependency> 
 * */
 