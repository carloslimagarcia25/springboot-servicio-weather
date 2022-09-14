package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name = "wind")
public class Wind {
	private Long id;
	private double speed;
	private int deg;
}
