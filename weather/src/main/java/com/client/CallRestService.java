package com.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import Weather.model.WeatherDetails;

@Component
public class CallRestService {
	
	private static void callRestService()
	{
		RestTemplate restTemplate = new RestTemplate();
		WeatherDetails weatherdetails =restTemplate.getForObject("api.openweathermap.org/data/2.5/weather?q=London",WeatherDetails.class);
		System.out.println("Weather : "+ weatherdetails.getCity());
		
	}

}
