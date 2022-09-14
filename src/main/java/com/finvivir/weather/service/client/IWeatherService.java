package com.finvivir.weather.service.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.finvivir.weather.exceptions.MensajeException;
import com.finvivir.weather.models.entity.Ciudad;

public interface IWeatherService {
	public ResponseEntity<Ciudad> getCiudad(String city) throws MensajeException, NoHandlerFoundException;
}
