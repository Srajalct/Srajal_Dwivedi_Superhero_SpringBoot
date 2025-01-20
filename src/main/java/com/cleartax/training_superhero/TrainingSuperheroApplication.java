package com.cleartax.training_superhero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cleartax.training_superhero", "com/cleartax/training_superhero/controllers"})
public class TrainingSuperheroApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingSuperheroApplication.class, args);
	}

}
