package com.frank.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frank.auth.domain.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String>{

}
