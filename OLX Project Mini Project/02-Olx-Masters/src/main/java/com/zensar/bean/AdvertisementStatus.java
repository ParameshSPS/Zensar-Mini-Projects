package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adv_status")
public class AdvertisementStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String status;

	// Getters & Setters
	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// ToString Method
	@Override
	public String toString() {
		return "AdvertisementStatus [id=" + id + ", status=" + status + "]";
	}
	
}