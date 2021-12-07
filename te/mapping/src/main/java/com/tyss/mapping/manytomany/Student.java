package com.tyss.mapping.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Table(name = "student_info")
@Entity
public class Student {
	
	@Id
	@Column
	private int sid;
	
	@Column
	private String name;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "student_course_info" , joinColumns = @JoinColumn(name="sid") , 
	inverseJoinColumns = @JoinColumn(name="cid"))
	private List<Course> courses;
}
