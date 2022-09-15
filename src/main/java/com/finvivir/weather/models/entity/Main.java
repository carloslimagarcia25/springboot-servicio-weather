package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="main")
public class Main {
	@Id
	private Long id;
	private double temp;
	private double feels_like;
	private double temp_min;
	private double temp_max;
	private double pressure;
	private int humidity;
	public Main(Long id) {
		this.id=id;
		this.temp=temp;
		this.feels_like=feels_like;
		this.temp_min=temp_min;
		this.temp_max=temp_max;
		this.pressure=temp_max;
		this.humidity=humidity;
	}
}
