package com.mybillbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybillbook.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
