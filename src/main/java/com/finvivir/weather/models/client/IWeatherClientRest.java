package com.finvivir.weather.models.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.finvivir.weather.models.entity.Ciudad;

import feign.FeignException;

@FeignClient(name = "openWeather",url = "https://api.openweathermap.org/data/2.5")
public interface IWeatherClientRest {
	@GetMapping("/weather")
	public ResponseEntity<Ciudad> getCiudad(@RequestParam String q, @RequestParam String appid, @RequestParam String metric, @RequestParam String lang) throws FeignException;
}
