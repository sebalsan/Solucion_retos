package Retos.retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"Modelo"})
public class RetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetosApplication.class, args);
	}

}
