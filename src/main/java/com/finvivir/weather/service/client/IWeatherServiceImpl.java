package com.finvivir.weather.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.finvivir.weather.exceptions.MensajeException;
import com.finvivir.weather.models.client.IWeatherClientRest;
import com.finvivir.weather.models.entity.Ciudad;

import feign.FeignException;




@Service
public class IWeatherServiceImpl implements IWeatherService {
	
	@Autowired
	private IWeatherClientRest clienteFeing;
	@Value("${app.language}")
	private String language;
	@Value("${app.units}")
	private String units;
	@Value("${app.appid}")
	private String appid;
	
	@Override
	public ResponseEntity<Ciudad> getCiudad(String city) throws MensajeException, NoHandlerFoundException{
		ResponseEntity <Ciudad> responseTemp=null;
		try {
			responseTemp= clienteFeing.getCiudad(city, appid, units, language);
		}catch (FeignException e) {
			if(e.status()==404)
				throw new NoHandlerFoundException(city, city, HttpHeaders.EMPTY); 
		}
		return responseTemp;
	}

}
