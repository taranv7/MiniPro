package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderBy;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="Login")
@Entity
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login_sequence")
@SequenceGenerator(name = "login_sequence", sequenceName = "login_sequence", allocationSize = 1)
@OrderBy("ID ASC")
private long Id;
private String email;
private String password;

public long getId()
{
	return Id;
}
public void setId(int Id)
{
	this.Id=Id;
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

public Login(long Id,  String email, String password)
{
	super();
	this.Id=Id;
	this.email=email;
	this.password=password;

}
public Login()
{
	
}
}
