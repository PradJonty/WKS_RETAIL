package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Integer>{

}
