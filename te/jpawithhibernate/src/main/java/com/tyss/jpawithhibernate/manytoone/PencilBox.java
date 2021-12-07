package com.tyss.jpawithhibernate.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pencil_box")
public class PencilBox {
	@Id
	@Column
	private int boxid;
	@Column
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "box")
	private List<Pencils> pencils;
	

}
