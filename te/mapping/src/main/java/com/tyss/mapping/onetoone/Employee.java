package com.tyss.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name = "empployee_info")
public class Employee {

	@Id
	@Column
	private int eid;
	
	@Column
	private String ename;
	
	@Exclude
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
	private Laptop laptop;
}
