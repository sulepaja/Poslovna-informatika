package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bank.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long>{

	Place findOneById(Long id);
}
