package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "coord")
public class Coord {
	@Id
	private Long id;
	private double lon;
	private double lat;
	
	public Coord (Long id) {
		this.id=id;
		this.lat=lat;
		this.lon=lon;
	}
}
