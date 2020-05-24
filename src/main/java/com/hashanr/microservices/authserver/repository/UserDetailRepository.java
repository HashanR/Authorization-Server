package com.hashanr.microservices.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashanr.microservices.authserver.model.User;
import java.util.Optional;
@Repository
public interface UserDetailRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String name);

}
