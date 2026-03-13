package com.sparta.cream.domain.product.entity;

import org.hibernate.annotations.SQLRestriction;

import com.sparta.cream.domain.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@SQLRestriction("deleted_at IS NULL")
public class ProductImage extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 255)
	private String fileName;

	@Column(nullable = false, length = 255)
	private String objectKey;

	@Column(nullable = false, length = 500)
	private String url;

	public ProductImage(String fileName, String objectKey, String url) {
		this.fileName = fileName;
		this.objectKey = objectKey;
		this.url = url;
	}
}
