package com.reactive.tickets.reactivetickets;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;

@SpringBootApplication
public class ReactiveTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveTicketsApplication.class, args);
	}
	
}

/**
 * Entity that represents a Ticket
 * 
 * @author hmosbahi
 *
 */
@AllArgsConstructor
@Data
class Ticket{
	
	private String id;
	private String eventTitle;
	private String eventDescription;
	private Date eventDate;
	
	
}
