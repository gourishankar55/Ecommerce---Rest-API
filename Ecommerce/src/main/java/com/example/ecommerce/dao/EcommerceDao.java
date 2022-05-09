package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Ecommerce;

public interface EcommerceDao extends JpaRepository<Ecommerce, Integer> {

}
