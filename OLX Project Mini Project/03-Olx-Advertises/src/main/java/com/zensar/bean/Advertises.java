package com.zensar.bean;

import java.time.LocalDate;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advertises")
public class Advertises {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private int category;
	private int status;
	private double price;
	private String description;
	private boolean active;
	private String posted_by;
	private String userName;
	private byte[] photo;
	@Column(name = "created_date")
	private LocalDate createdate;
	@Column(name = "modified_date")
	private LocalDate modifydate;

	// Getters & Setters
	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getCategory() {
		return category;
	}

	public int getStatus() {
		return status;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public boolean isActive() {
		return active;
	}

	public String getPosted_by() {
		return posted_by;
	}

	public String getUserName() {
		return userName;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public LocalDate getCreatedate() {
		return createdate;
	}

	public LocalDate getModifydate() {
		return modifydate;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}

	public void setModifydate(LocalDate modifydate) {
		this.modifydate = modifydate;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", category=" + category + ", status=" + status
				+ ", price=" + price + ", description=" + description + ", active=" + active + ", posted_by="
				+ posted_by + ", userName=" + userName + ", photo=" + Arrays.toString(photo) + ", createdate="
				+ createdate + ", modifydate=" + modifydate + "]";
	}

}