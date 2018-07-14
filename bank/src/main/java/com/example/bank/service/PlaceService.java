package com.example.bank.service;



import java.util.List;

import com.example.bank.model.Place;

public interface PlaceService {
	
	List<Place> getAll();
	List<Place> findAll();
	
	Place findById(Long id);
	
	Place getPlaceById(Long id);
}

