package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name="clouds")
public class Clouds {
	private Long id;
	private int all;
}
