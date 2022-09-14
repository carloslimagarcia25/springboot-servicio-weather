package com.finvivir.weather.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;
import com.finvivir.weather.exceptions.MensajeException;
import com.finvivir.weather.models.entity.Ciudad;
import com.finvivir.weather.service.client.IWeatherService;




@RestController
@RequestMapping("/fin-vivir")
public class WeatherController {
	@Autowired
	private IWeatherService weatherService;
	
	@GetMapping(value = { "/clima/{city}", "/clima"})
	public ResponseEntity<Ciudad> getWeather(@PathVariable(required = false) String city) throws MensajeException, NoHandlerFoundException  {
		if(city==null||city.isEmpty())
			throw new MensajeException("Ciudad es requerida");
		return  weatherService.getCiudad(city);
	}
}
