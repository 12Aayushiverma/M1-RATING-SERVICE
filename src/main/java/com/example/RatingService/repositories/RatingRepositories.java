package com.example.RatingService.repositories;

import com.example.RatingService.entities.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepositories extends JpaRepository<Ratings,Integer> {

      List<Ratings> findByUserId(Integer userId);

     List<Ratings> findByHotelId(Integer hotelId);


}
