package com.sample.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

// 新增swagger 在浏览器输入 http://localhost:8080/swagger-ui.html 即可查看swagger

public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sample.demo"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Monkey-Sun的服务")
                .description("GitHub：https://github.com/Monkey-Sun")
                .version("1.0")
                .termsOfServiceUrl("http://localhost")
                .licenseUrl("localhost")
                .build();
    }
}
