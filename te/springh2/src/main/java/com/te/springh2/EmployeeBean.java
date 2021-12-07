package com.te.springh2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
@JsonRootName("employee-info")
@JsonPropertyOrder({ "eid", "name" })
@XmlRootElement(name = "employee-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeBean implements Serializable {

	@Id
	@Column
	@JsonProperty("emp_id")
	@XmlElement
	private Integer id;

	@Column
	@XmlElement
	private String name;

	@Column(name = "dob")
	@XmlElement
	private Date birthDate;

	
	@Column
	@XmlElement
	private String password;

}
