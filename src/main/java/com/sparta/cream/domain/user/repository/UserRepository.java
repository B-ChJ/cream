package com.sparta.cream.domain.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.cream.domain.user.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	boolean existsByEmail(String email);
	Optional<Users> findByEmail(String email);
}

