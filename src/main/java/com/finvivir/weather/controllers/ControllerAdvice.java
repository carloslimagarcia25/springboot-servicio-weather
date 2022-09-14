package com.finvivir.weather.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import com.finvivir.weather.exceptions.MensajeException;
import com.finvivir.weather.models.entity.CodigoMensaje;


@RestControllerAdvice
public class ControllerAdvice {
	  @ExceptionHandler(value = MensajeException.class)
	    public ResponseEntity<CodigoMensaje> runtimeExcpcionHandler400(MensajeException e){
	        CodigoMensaje cd = CodigoMensaje.builder().codigo(HttpStatus.BAD_REQUEST.value()).mensaje(e.getMessage()).build();
	        return new ResponseEntity<>(cd, HttpStatus.BAD_REQUEST);
	    }

	    @ExceptionHandler(value = RuntimeException.class)
	    public ResponseEntity<CodigoMensaje> runtimeExceptionHandler500(){
	        CodigoMensaje cd = CodigoMensaje.builder().codigo(HttpStatus.INTERNAL_SERVER_ERROR.value()).mensaje("Problema interno en el servidor").build();
	        return new ResponseEntity<>(cd, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	    @ExceptionHandler(value = NoHandlerFoundException.class)
	    public ResponseEntity<CodigoMensaje> handlerNoHandlerFound(NoHandlerFoundException e){
	        CodigoMensaje cd = CodigoMensaje.builder().codigo(HttpStatus.NOT_FOUND.value()).mensaje("Recurso no encontrado").build();
	        return new ResponseEntity<>(cd, HttpStatus.NOT_FOUND);
	    }

}
