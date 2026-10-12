package com.example.OfficeCafeteriaMenu.service;

import org.springframework.stereotype.Service;

import com.example.OfficeCafeteriaMenu.repository.MenuRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class MenuService {
    private final MenuRepository menuRepository;
}
