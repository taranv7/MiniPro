package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.SignUp;

public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

	

}
