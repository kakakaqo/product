package com.kimminwoo.product.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbl_catgory")
public class Category {
	
	@Id
	@GeneratedValue
	@Column(length = 10)
	private Integer categoryId;
	
	@NotNull
	@Size(min=8, 
		  max=50, 
		  message="카테고리명은 8~50자입니다")
	@Column(length = 50, nullable=false)
	private String categoryName;
	
	@Column(length = 100)
	private String description;
		
	//@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime regDate = LocalDateTime.now(); // 현재일자
	
}
