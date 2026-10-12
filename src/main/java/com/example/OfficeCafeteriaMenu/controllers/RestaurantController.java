package com.example.OfficeCafeteriaMenu.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeCafeteriaMenu.dto.CreateRestaurantDTO;
import com.example.OfficeCafeteriaMenu.schema.Restaurant;
import com.example.OfficeCafeteriaMenu.service.RestaurantService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController 
@RequestMapping ("/api/restaurants")
@AllArgsConstructor 
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping("")
    public ResponseEntity <List<Restaurant>> getAllRestaurants() {
       List <Restaurant> li = restaurantService.getAllRestaurants();
       return ResponseEntity.ok(li);
    }

    @PostMapping("")
    public ResponseEntity<String> createRestaurant(@RequestBody CreateRestaurantDTO c){
        try{
            String  s = restaurantService.createRestaurant(c);
            return ResponseEntity.status(HttpStatus.CREATED).body(s);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getRestaurantById(@PathVariable Long id){
        try{
            Restaurant r = restaurantService.getRestaurantById(id);
            return ResponseEntity.status(HttpStatus.OK).body(r);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateRestaurant(@PathVariable Long id, @RequestBody CreateRestaurantDTO c) {
        try{
            Restaurant r = restaurantService.updateRestaurant(c, id);
            return ResponseEntity.status(HttpStatus.OK).body(r);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteRestaurantById(@PathVariable Long id){
        try{
            String res = restaurantService.deleteRestaurantById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(res);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    
}
