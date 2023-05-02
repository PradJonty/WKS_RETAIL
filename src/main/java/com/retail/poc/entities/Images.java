package com.retail.poc.entities;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="images")
public class Images {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne(targetEntity = SubCategory.class)
	@JoinColumn(name = "subCategory", referencedColumnName = "id")
	private SubCategory subCategory;
	    
	@Column(name = "image_url")
	private String imageUrl;

	
	
	public Images(SubCategory subCategory, String imageUrl) {
		super();
		this.subCategory = subCategory;
		this.imageUrl = imageUrl;
	}


    public Images(Integer id, SubCategory subCategory, String imageUrl) {
		super();
		this.id = id;
		this.subCategory = subCategory;
		this.imageUrl = imageUrl;
	}


    public Images() {
		super();
		
	}


	@Override
	public String toString() {
		return "Images [id=" + id + ", subCategory=" + subCategory + ", imageUrl=" + imageUrl + "]";
	}
    
	
	

}
