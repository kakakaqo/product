package com.kimminwoo.product.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

	private Integer categoryId;
	
	@NotNull(message = "카테고리명을 입력하세여.")
	@Size(min = 5, max = 50, message = "카테고리명은 문자 5~50자 사이로 입력하세요.")
	private String categoryName;
	
	@NotEmpty
	@Size(min = 5, max = 100, message = "카테고리 설명은 문자 5자~100자 사이로 입력하세요.")
	private String description;
	
	@Builder.Default
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regDate = LocalDateTime.now();
}
