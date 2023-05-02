package com.retail.poc.entities;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String code;
	private String address;
	private String number;
	@ManyToOne(targetEntity = Millwork.class)
    @JoinColumn(name = "millwork", referencedColumnName = "id")
    private Millwork millwork;
	public Supplier(int id, String name, String code, String address, String number, Millwork millwork) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.address = address;
		this.number = number;
		this.millwork = millwork;
	}
	
	public Supplier(String name, String code, String address, String number, Millwork millwork) {
		super();
		this.name = name;
		this.code = code;
		this.address = address;
		this.number = number;
		this.millwork = millwork;
	}

	public Supplier() {
		super();
		
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", code=" + code + ", address=" + address + ", number="
				+ number + ", millwork=" + millwork + "]";
	}
    
	
	
	

}
