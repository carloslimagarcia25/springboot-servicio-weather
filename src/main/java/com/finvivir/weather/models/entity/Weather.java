package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="weather")
public class Weather {
	@Id
	private Long id;
	private String main;
	private String description;
	private String icon;
	
	public Weather(Long id) {
		this.id=id;
		this.main=main;
		this.description=description;
		this.icon=icon;
	}
}
