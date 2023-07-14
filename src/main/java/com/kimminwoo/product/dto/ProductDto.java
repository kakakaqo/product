package com.kimminwoo.product.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.kimminwoo.product.dto.ProductDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private Integer productId;

	@NotNull
	@Size(min = 5, max = 50, message = "상품명은 5~50자입니다")
	private String productName;

	@NotNull
	@Positive(message = "상품 가격은 양수여야 합니다.")
	private Integer price = 0;

	//@NotNull
	//private Category category;
	private Integer categoryId;


	@Size(max = 100, message = "카테고리 설명은 100자를 넘을 수 없습니다.")
	private String description;

	@Builder.Default
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime regDate = LocalDateTime.now();
}
