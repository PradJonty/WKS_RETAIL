package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.MainCategory;

@Repository
public interface MainCategoryRepo extends JpaRepository<MainCategory, Integer>{

}
