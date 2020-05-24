package com.hashanr.microservices.authserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hashanr.microservices.authserver.model.AuthUserDetail;
import com.hashanr.microservices.authserver.model.User;
import com.hashanr.microservices.authserver.repository.UserDetailRepository;

public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailRepository userDetailRepository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		Optional<User> optionalUser = userDetailRepository.findByUsername(name);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or password wrong"));
        
        UserDetails userDetails = new AuthUserDetail(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
	}

	
}
