package com.frank.auth.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.frank.auth.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
