package com.mytech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytech.entity.Product;

@Repository
public interface ApiRepo extends JpaRepository<Product, Integer>{

}
