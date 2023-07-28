package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Login;

public interface LoginRepo extends JpaRepository<Login, Integer> {

	Login findByEmail(String email);

}
