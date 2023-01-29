package com.ws.work.java.test.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableOpenApi
@EnableWebMvc
@EnableSwagger2
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		RestTemplate rest = new RestTemplate();
		String url = "https://fipeapi.appspot.com/api/1/carros/veiculo/" + "chevrolet" + "/" + "sedan" + "/" + "2010" + ".json";
//		var response = rest.getForObject(url, String.class);
//		System.out.println(response);
	}

}
