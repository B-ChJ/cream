package com.sparta.cream.domain.product.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sparta.cream.domain.product.dto.ProductSearchCondition;
import com.sparta.cream.domain.product.entity.Product;

public interface ProductCustomRepository {
	Page<Product> searchProducts(ProductSearchCondition productSearchCondition,boolean includeDeleted, Pageable pageable);
}
