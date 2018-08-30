package com.cg.imageserver.ImageServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.cg.imageserver.model")
@EnableJpaRepositories("com.cg.imageserver.repository")
@SpringBootApplication
@ComponentScan("com.cg.imageserver")
public class ImageServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageServerApplication.class, args);
	}
}
