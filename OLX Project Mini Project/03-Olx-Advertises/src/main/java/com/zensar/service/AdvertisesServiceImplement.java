package com.zensar.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Advertises;
import com.zensar.db.AdvertisesDAO;

@Service
public class AdvertisesServiceImplement implements AdvertisesService {
	@Autowired
	AdvertisesDAO dao;

	// New Advertise
	@Override
	public Advertises newAdvertise(Advertises ad) {
		Advertises adv = dao.save(ad);
		return adv;
	}

	// Update Advertise
	@Override
	public Advertises updateAdvertise(Advertises ad, Integer id) {
		Optional<Advertises> advertise = dao.findById(id);
		if (advertise != null) {
			return dao.save(ad);
		}
		return null;
	}

	// Read All
	@Override
	public List<Advertises> getAllAdvertises() {
		return dao.findAll();
	}

	// Delete Advertise
	@Override
	public boolean deleteAdvertiseById(Integer id) {
		dao.deleteById(id);
		if (dao.findById(id) != null) {
			return false;
		}
		return true;
	}

	// Matches advertisements using the provided 'searchText' within all fields of
	// an advertise.
	@Override
	public Advertises getAdvertiseByText(String text) {
		Advertises advertise = ((AdvertisesServiceImplement) dao).getAdvertiseByText(text);
		return advertise;
	}

	// Read by Id
	@Override
	public Advertises getAdvertisesById(Integer id) {
		Optional<Advertises> advertise = dao.findById(id);
		if (advertise.isPresent()) {
			return advertise.get();
		} else {
			return null;
		}
	}

}