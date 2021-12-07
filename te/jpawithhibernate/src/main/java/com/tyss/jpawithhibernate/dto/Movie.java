package com.tyss.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Movie_detail")
public class Movie {
	@Id
	@Column
	private int mid;
	@Column(name="Movie_name")
	private String name;
	@Column
	private String rating;

}
