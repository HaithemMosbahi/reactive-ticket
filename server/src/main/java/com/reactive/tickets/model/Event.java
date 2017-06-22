package com.reactive.tickets.model;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * An entity that represents an Event such as Movie, concert, etc.
 * 
 * @author hmosbahi
 *
 */
@AllArgsConstructor
@Data
public class Event{
	
	private String id;
	private String title;
	private String description;
	private String category;
	private Date date;
	private Set<Ticket> tickets;
	
	
}