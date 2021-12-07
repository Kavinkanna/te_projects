package com.tyss.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Table(name = "laptop_info")
@Entity
@Data
public class Laptop {

	@Id
	@Column
	private int sid;
	
	@Column
	private String sname;
	
	@Exclude
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid")
	private Employee employee;
}
