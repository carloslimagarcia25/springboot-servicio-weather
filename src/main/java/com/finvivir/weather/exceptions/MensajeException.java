package com.finvivir.weather.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensajeException extends Exception{
	private int codigo;
    private String mensaje;

    public MensajeException(String mensaje) {
        super(mensaje);
        this.codigo = codigo;
    }

}
