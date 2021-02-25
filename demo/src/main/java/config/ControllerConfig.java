package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.IndexController;




@Configuration
public class ControllerConfig {
	
	@Bean
	public IndexController indexController() {
		return new IndexController();
	}

	
}
