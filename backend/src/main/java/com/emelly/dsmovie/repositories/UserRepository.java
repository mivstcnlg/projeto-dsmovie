package com.emelly.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emelly.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
