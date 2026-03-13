package com.sparta.cream.domain.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.cream.domain.payment.entity.Refund;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
