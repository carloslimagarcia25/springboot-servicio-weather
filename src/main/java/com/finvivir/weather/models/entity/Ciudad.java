package com.finvivir.weather.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable{
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Coord coord;
	@OneToMany
	private List<Weather> weather;
	private String base;
	@OneToOne
	private Main main;
	private Long visibility;
	@OneToOne
	private Wind wind;
	@OneToOne
	private Clouds clouds;
	private Long dt;
	@OneToOne
	private Sys sys;
	private Long timezone;
	@Id
	private Long id;
	private String name;
	private int cod;
	
	public Ciudad() {
		
	}
}
