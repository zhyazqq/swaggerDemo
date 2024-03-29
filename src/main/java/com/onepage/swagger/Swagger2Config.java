//package com.onepage.swagger;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//这个是第二中界面配置文件
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class Swagger2Config {
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("indi.viyoung.viboot.*"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("viboot-swagger2")    //标题
//                .description("Restful-API-Doc")    //描述
//                .termsOfServiceUrl("https://www.cnblogs.com/viyoung") //这里配置的是服务网站，我写的是我的博客园站点~欢迎关注~
//                .contact(new Contact("Vi的技术博客", "https://www.cnblogs.com/viyoung", "18530069930@163.com")) // 三个参数依次是姓名，个人网站，邮箱
//                .version("1.0") //版本
//                .build();
//    }
//}