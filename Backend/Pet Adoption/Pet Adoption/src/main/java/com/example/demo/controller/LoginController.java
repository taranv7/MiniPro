package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Login;
import com.example.demo.Service.LoginService;


@CrossOrigin
@RestController
@RequestMapping("/log")
public class LoginController{
@Autowired

private LoginService dtlservice;
@GetMapping("/getl")

public List<Login> getDetails(){
	return dtlservice.getAllDetails();
}

@PostMapping("/addl")
public Login postDetails(@RequestBody Login l) {
	 return dtlservice.saveDetails(l);
}

@DeleteMapping("/deletel/{Id}")
public String delete(@PathVariable int Id)
{
	dtlservice.deleteDepartmentById(Id);
	return "Deleted";
}

@PutMapping("/Updatel/{Id}")
public Login update(@PathVariable int Id,@RequestBody Login l)
{
	return dtlservice.update(Id, l);
}

}
