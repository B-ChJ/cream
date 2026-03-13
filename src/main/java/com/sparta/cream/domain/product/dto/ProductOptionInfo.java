package com.sparta.cream.domain.product.dto;

import com.sparta.cream.domain.product.entity.ProductOption;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductOptionInfo {
	private final Long id;
	private final String size;

	public static ProductOptionInfo from(ProductOption productOption) {
		return new ProductOptionInfo(
			productOption.getId(),
			productOption.getSize()
		);
	}
}
