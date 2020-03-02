package com.sid.companyservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class CompanyServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(CompanyRepo companyRepo){
		return args -> {
			Stream.of("A","B","C","D").forEach(c->{
				companyRepo.save(new Company(null,c,100+Math.random()*900));
			});

			companyRepo.findAll().forEach(System.out::println);
		};
	}
}
