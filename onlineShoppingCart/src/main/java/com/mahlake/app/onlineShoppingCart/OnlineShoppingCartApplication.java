package com.mahlake.app.onlineShoppingCart;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class OnlineShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingCartApplication.class, args);

		/*new SpringApplicationBuilder(OnlineShoppingCartApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);*/
	}

}
