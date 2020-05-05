package com.example.podcastservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PodcastserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodcastserviceApplication.class, args);
	}

}
