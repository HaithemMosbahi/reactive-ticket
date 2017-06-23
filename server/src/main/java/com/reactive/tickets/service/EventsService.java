package com.reactive.tickets.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.reactive.tickets.model.Event;

import reactor.core.publisher.Flux;

/**
 * Service to fetch upcoming events
 * 
 * @author hmosbahi
 *
 */
@Service
public class EventsService {
	
	@Value("${events.api.url}")
	private String apiUrl;
	@Value("${events.api.key}")
	private String apiKey;
	
	
	public Flux<JsonNode> fetchEvents(){
		
		String eventsUrl = apiUrl+"?client_id="+apiKey;
		RestTemplate restTemplate=new RestTemplate();
		JsonNode result = restTemplate.getForObject(eventsUrl, JsonNode.class);
		
		return Flux.just(result.get("events"));
	}
	
	
	
	

}
