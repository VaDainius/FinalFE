package ca.BaigiamsisFE;

import ca.BaigiamsisFE.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BaigiamsisFeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaigiamsisFeApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	User user() {
		return new User();
	}

}
