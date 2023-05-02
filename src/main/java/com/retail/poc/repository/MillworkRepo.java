package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.Millwork;

@Repository
public interface MillworkRepo extends JpaRepository<Millwork, Integer> {

}
