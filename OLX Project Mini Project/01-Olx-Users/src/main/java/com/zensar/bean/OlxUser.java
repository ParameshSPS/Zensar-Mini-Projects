package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class OlxUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String userName;
	private String password;
	private String roles;
	private String active;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	// Getters & Setters
	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getRoles() {
		return roles;
	}

	public String getActive() {
		return active;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// ToString Method
	@Override
	public String toString() {
		return "OlxUser [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles
				+ ", active=" + active + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
}