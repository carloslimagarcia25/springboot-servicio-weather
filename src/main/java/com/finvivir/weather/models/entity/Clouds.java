package com.finvivir.weather.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="clouds")
public class Clouds {
	@Id
	private Long id;
	private int all;
	public Clouds(Long id) {
		this.id=id;
		this.all=all;
	}
}
