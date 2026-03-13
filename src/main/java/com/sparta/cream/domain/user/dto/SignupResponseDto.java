package com.sparta.cream.domain.user.dto;

import java.time.LocalDateTime;

import com.sparta.cream.domain.user.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 회원가입 응답 DTO
 *
 * @author 오정빈
 * @version 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupResponseDto {

	private Long id;
	private String email;
	private String name;
	private UserRole role;
	private LocalDateTime createdAt;
}

