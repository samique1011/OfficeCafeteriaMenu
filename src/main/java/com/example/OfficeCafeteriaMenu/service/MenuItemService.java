package com.example.OfficeCafeteriaMenu.service;

import org.springframework.stereotype.Service;

import com.example.OfficeCafeteriaMenu.repository.MenuItemRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;
}
