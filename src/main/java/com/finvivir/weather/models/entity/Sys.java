package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sys")
public class Sys {
	@Id
	private Long id;
	private int type;
	private String country;
	private Long sunrise;
	private Long sunset;
}
