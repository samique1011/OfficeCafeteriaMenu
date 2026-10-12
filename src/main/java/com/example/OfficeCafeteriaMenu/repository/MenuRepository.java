package com.example.OfficeCafeteriaMenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeCafeteriaMenu.schema.Menu;

@Repository 
public interface MenuRepository extends JpaRepository<Menu , Long>{
    
}
