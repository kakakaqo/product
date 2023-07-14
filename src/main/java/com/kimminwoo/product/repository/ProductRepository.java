package com.kimminwoo.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kimminwoo.product.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

}