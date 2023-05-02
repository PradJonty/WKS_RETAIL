package com.retail.poc.entities;

import java.sql.Timestamp;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="SubCatgeory")

public class SubCategory {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String code;
	 private String name;
	 
	 @ManyToOne(targetEntity = Millwork.class)
	 @JoinColumn(name = "millwork", referencedColumnName = "id")
	 private Millwork millwork;
	   
	 @Column(name = "created_at")
	 private Timestamp createdAt;
	    
	 @Column(name = "updated_at")
	  private Timestamp updatedAt;
	    
	 @Column(name = "created_by")
	  private String createdBy;
	    
	  @Column(name = "updated_by")
	  private String updatedBy;
	    
	  @ManyToOne(targetEntity = User.class)
	  @JoinColumn(name = "user", referencedColumnName = "username")
	  private User user;

	public SubCategory(Integer id, String code, String name, Millwork millwork, Timestamp createdAt,
			Timestamp updatedAt, String createdBy, String updatedBy, User user) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.millwork = millwork;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.user = user;
	}

	public SubCategory(String code, String name, Millwork millwork, Timestamp createdAt, Timestamp updatedAt,
			String createdBy, String updatedBy, User user) {
		super();
		this.code = code;
		this.name = name;
		this.millwork = millwork;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.user = user;
	}

	public SubCategory() {
		super();
	
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", code=" + code + ", name=" + name + ", millwork=" + millwork + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", user=" + user + "]";
	}
	  
	
	

}
