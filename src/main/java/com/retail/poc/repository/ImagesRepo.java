package com.retail.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.poc.entities.Images;

@Repository
public interface ImagesRepo extends JpaRepository<Images, Integer> {

}
