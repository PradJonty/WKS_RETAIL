package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Integer> {

}
