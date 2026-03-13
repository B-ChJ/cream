package com.sparta.cream.domain.product.dto;

import com.sparta.cream.domain.product.entity.ProductImage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductImageUploadResponse {
	private final Long imageId;
	private final String originalFileName;
	private final String objectKey;
	private final String url;

	public static ProductImageUploadResponse from(ProductImage productImage) {
		return new ProductImageUploadResponse(
			productImage.getId(),
			productImage.getFileName(),
			productImage.getObjectKey(),
			productImage.getUrl()
		);
	}
}
