package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepo extends JpaRepository<Products, Long> {



}
