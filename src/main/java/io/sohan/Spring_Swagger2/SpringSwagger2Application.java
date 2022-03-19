package io.sohan.Spring_Swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwagger2Application.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.apis(RequestHandlerSelectors.basePackage("io.sohan.Spring_Swagger2"))
				.build()
				.apiInfo(apiDetails());
	}
	private ApiInfo apiDetails(){
		return new ApiInfo(
				"Spring Swagger Api",
				"Basic Swagger Documentation details",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Sohan Barman","http://xyz.com","abc@gmail.com"),
				"Api License",
				"http://xyz.com",
				Collections.emptyList());

	}
}
