package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.User;


@Repository

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
