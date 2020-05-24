package com.clear.you.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 设置基包，只扫描这个包及其子包的接口
                .apis(RequestHandlerSelectors.basePackage("com.clear.you"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring boot 集成swagger")
                .description("本项目用于展示个人在使用Spring开发的过程中总结的最佳实践")
                .contact(
                        new Contact("clear zk", "https://www.github.com/clearzk", "1416174707@qq.com")
                )
                .version("1.0.0")
                .build();
    }
}
