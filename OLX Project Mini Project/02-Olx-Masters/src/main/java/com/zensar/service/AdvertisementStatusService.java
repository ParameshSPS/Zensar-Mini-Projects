package com.zensar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.AdvertisementStatus;
import com.zensar.db.AdvertisementStatusDAO;

@Service
public class AdvertisementStatusService {

	@Autowired
	AdvertisementStatusDAO dao;

	// Add Category
	public AdvertisementStatus addAdevrAdvertisementStatus(AdvertisementStatus advertisementStatus) {
		return this.dao.save(advertisementStatus);
	}

	// Get All
	public List<AdvertisementStatus> getAllAdvertisementStatus() {
		return this.dao.findAll();
	}

}