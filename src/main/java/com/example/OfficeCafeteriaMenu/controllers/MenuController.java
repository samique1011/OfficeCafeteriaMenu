package com.example.OfficeCafeteriaMenu.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeCafeteriaMenu.service.MenuService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController 
@RequestMapping ("/api/menus")
@AllArgsConstructor 
public class MenuController {
    private final MenuService menuService;
}
