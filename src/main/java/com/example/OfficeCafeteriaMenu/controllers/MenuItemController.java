package com.example.OfficeCafeteriaMenu.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeCafeteriaMenu.service.MenuItemService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping ("/api/menu-items")
@AllArgsConstructor 
public class MenuItemController {
    private final MenuItemService menuItemService;
}
