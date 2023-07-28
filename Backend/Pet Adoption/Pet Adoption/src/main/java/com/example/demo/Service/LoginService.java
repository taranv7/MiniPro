package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Login;
import com.example.demo.Repo.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo dtl;
public Login saveDetails(Login l) {
	return dtl.save(l);
}
public List<Login> getAllDetails()
{
	return dtl.findAll();
}
public void deleteDepartmentById(int Id)
{
	dtl.deleteById(Id);
}
public Login update(int Id, Login l)
{
	return dtl.save(l);
}
}