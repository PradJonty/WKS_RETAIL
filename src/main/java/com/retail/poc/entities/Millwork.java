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
@Table(name="millwork")
public class Millwork {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String status;
	private Integer height;
	private Integer length;
	private Integer depth;
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
	public Millwork(Integer id, String name, String status, Integer height, Integer length, Integer depth,
			Timestamp createdAt, Timestamp updatedAt, String createdBy, String updatedBy, User user) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.height = height;
		this.length = length;
		this.depth = depth;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.user = user;
	}
	public Millwork(String name, String status, Integer height, Integer length, Integer depth, Timestamp createdAt,
			Timestamp updatedAt, String createdBy, String updatedBy, User user) {
		super();
		this.name = name;
		this.status = status;
		this.height = height;
		this.length = length;
		this.depth = depth;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.user = user;
	}
	public Millwork() {
		super();
	}
	@Override
	public String toString() {
		return "Millwork [id=" + id + ", name=" + name + ", status=" + status + ", height=" + height + ", length="
				+ length + ", depth=" + depth + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", user=" + user + "]";
	}
	
	
 
	
	
}
