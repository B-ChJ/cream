package com.sparta.cream.domain.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class S3UploadResult {
	private final String originalFileName;
	private final String objectKey;
	private final String url;
}
