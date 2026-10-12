package com.example.OfficeCafeteriaMenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeCafeteriaMenu.schema.Restaurant;

@Repository 
public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {
    
}
