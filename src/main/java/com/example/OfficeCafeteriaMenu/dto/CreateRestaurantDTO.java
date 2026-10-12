package com.example.OfficeCafeteriaMenu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class CreateRestaurantDTO {
    private String name;
    private String location;
}
