package com.kimminwoo.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.kimminwoo.product.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

	
}