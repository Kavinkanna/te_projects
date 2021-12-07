package com.tyss.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Cousre_Info")
public class CousreInfo {
	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "cousre")
	private List<StudentInfo> studentInfo;

}
