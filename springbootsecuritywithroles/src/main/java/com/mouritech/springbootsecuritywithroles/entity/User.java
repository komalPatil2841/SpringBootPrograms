package com.mouritech.springbootsecuritywithroles.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private String userName;
	private String password;
	private boolean isActive;
	private String roles;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public User(Integer id, String userName, String password, boolean isActive, String roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.roles = roles;
	}
	public User(String userName, String password, boolean isActive, String roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.roles = roles;
	}
	
	


}
