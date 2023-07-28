package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Register")
@Entity
public class SignUp {
@Id
@Column(name="Id")
private int Id;
@Column(name="fullname")
private String fullname;
@Column(name="email")
private String email;
@Column(name="password")
private String password;
@Column(name="confirmpassword")
private String confirmpassword;


public int getId()
{
	return Id;
}
public void setId(int Id)
{
	this.Id=Id;
}

public String getfirstname()
{
	return fullname;
}
public void setName(String firstname) {
	this.fullname = firstname;
}

public String getemail() 
{
	return email;
}
public void setemail(String email)
{
	this.email=email;
}
public String getpassword()
{
	return password;
}
public void setpasswors(String password)
{
	this.password=password;
}
public String getconfirmpassword()
{
	return confirmpassword;
}
public void setconfirmpassword(String confirmpassword)
{
	this.confirmpassword = confirmpassword;
}
public SignUp(int Id,String firstname, String lastname, String email, String password, String confirmpassword)
{
	super();
	this.Id=Id;
	this.fullname=firstname;
	this.email=email;
	this.password=password;
	this.confirmpassword = confirmpassword;

	
}
public SignUp()
{
	
}
}
