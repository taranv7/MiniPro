package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.SignUp;
import com.example.demo.Repo.SignUpRepo;

@Service
public class SignUpService {
@Autowired
private SignUpRepo dtl;
public SignUp saveDetails(SignUp d) {
	return dtl.save(d);
}
public List<SignUp> getAllDetails()
{
	return dtl.findAll();
}
public void deleteDepartmentById(int Id)
{
	dtl.deleteById(Id);
}
public SignUp update(int Id, SignUp d)
{
	return dtl.save(d);
}
}