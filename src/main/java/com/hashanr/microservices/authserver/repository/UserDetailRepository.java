package com.hashanr.microservices.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashanr.microservices.authserver.model.User;
import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String name);

}
