package com.example.OfficeCafeteriaMenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OfficeCafeteriaMenu.schema.Menu_MenuItem;

public interface MenuMenuItemRepository extends JpaRepository<Menu_MenuItem , Long> {
    
}
