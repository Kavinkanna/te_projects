package com.tyss.mapping.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table( name="item_details")
public class Item {

	@Id
	@Column
	private int id;
	
	@Column
	private String iname;
	
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "cid")
	private Cart cart;
}
