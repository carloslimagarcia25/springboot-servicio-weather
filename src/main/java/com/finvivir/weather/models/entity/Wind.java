package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "wind")
public class Wind {
	@Id
	private Long id;
	private double speed;
	private int deg;
	
	public Wind(Long id) {
		this.id=id;
		this.speed=speed;
		this.deg=deg;
	}
}
