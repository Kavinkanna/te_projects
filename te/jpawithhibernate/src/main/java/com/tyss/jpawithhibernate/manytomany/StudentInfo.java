package com.tyss.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="student_info")
public class StudentInfo {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_cousre",joinColumns = @JoinColumn(name="sid"),
	inverseJoinColumns = @JoinColumn(name="cid"))
	private List<CousreInfo> cousre;//Unidirectional

}
