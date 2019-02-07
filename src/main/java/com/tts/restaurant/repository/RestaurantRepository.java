package com.tts.restaurant.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.restaurant.models.Restaurant;

public interface RestaurantRepository extends CrudRepository <Restaurant, Long>{

}
