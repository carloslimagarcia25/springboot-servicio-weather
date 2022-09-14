package com.finvivir.weather.models.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CodigoMensaje {
	private int codigo;
    private String mensaje;
}
