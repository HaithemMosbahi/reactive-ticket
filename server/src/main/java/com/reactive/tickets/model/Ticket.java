package com.reactive.tickets.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Entity that represents a Ticket related to an {@link Event} 
 * 
 * @author hmosbahi
 *
 */
@AllArgsConstructor
@Data
public class Ticket{
	
	private String number;
	private Date date;
	private String customer;
	private Event event;

	
	
}

