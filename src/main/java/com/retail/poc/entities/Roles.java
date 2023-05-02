package com.retail.poc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="roles")
public class Roles {
	@Id
	@Column(name = "rId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int rId;
	private String name;
	public Roles(int rId, String name) {
		super();
		this.rId = rId;
		this.name = name;
	}
	
	public Roles(String name) {
		super();
		this.name = name;
	}

	public Roles() {
		super();
		
	}

	@Override
	public String toString() {
		return "Roles [rId=" + rId + ", name=" + name + "]";
	}
	
	
}