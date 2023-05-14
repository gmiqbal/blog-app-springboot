package com.gmiqbal.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmiqbal.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
