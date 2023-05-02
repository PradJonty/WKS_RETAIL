package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.SubCategory;

@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Integer> {

}
