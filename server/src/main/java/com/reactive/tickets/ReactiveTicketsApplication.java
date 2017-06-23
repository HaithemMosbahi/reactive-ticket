package com.reactive.tickets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.reactive.tickets.service.EventsService;


@SpringBootApplication
public class ReactiveTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveTicketsApplication.class, args);
	}
	

  @Bean
  CommandLineRunner testEvents(EventsService eventService){
	  return args -> {
		  eventService.fetchEvents().toStream().forEach(System.out::println);
	  };
  }
	
	
	
	
}



