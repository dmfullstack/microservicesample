package com.frank.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frank.auth.domain.AccessToken;

public interface AccessTokenRepository extends JpaRepository<AccessToken, String> {
}