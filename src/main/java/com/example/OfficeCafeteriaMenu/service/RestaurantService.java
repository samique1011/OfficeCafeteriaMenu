package com.example.OfficeCafeteriaMenu.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.OfficeCafeteriaMenu.dto.CreateRestaurantDTO;
import com.example.OfficeCafeteriaMenu.repository.RestaurantRepository;
import com.example.OfficeCafeteriaMenu.schema.Restaurant;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 

public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    public String createRestaurant(CreateRestaurantDTO c){
        try{
            Restaurant r = Restaurant.builder().name(c.getName()).location(c.getLocation()).build();
            restaurantRepository.save(r);
            return "Restaurant created";
            
        }catch(DataIntegrityViolationException e){
            throw new RuntimeException("Invalid request");
        }
    }

    public List <Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Long id)throws RuntimeException {
        return restaurantRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Such restaurant doesn't Exists"));
    }

    public Restaurant updateRestaurant(CreateRestaurantDTO c , Long id){
        Restaurant r = restaurantRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Restaurant with such id doesnt exists"));

        r.setName(c.getName());
        r.setLocation(c.getLocation());

        return restaurantRepository.save(r);
    }

    public String  deleteRestaurantById(Long id) throws RuntimeErrorException{
        if(restaurantRepository.existsById(id)){
            restaurantRepository.deleteById(id);
            return "Restaurant Deleted";
        }
        else   throw new RuntimeException("Restaurant not found with id: " + id);
    }


}
