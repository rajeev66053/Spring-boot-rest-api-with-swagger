package com.java.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class BookConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Book-Public-Api")
				.apiInfo(getApiInfo())
				.select()
				//.paths(regex("/book.*")) //To ignore basic Error controller from swagger ui. If we remove this it will show error controller api
				//.apis(RequestHandlerSelectors.basePackage("com.java.api.controller"))//To ignore basic Error controller from swagger ui. If we remove this it will show error controller api
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))//Only show rest controller and is better way of doing.To ignore basic Error controller from swagger ui. If we remove this it will show error controller api
				.build();
	}

	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder().title("Book Service APIs")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java_Gyan_Mantra License")
				.licenseUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.version("1.0")
				.build();
	}

}
