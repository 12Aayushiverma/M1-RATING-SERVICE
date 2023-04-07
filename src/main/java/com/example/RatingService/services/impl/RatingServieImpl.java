package com.example.RatingService.services.impl;

import com.example.RatingService.entities.Ratings;
import com.example.RatingService.repositories.RatingRepositories;
import com.example.RatingService.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServieImpl implements RatingServices {


    @Autowired
    private RatingRepositories ratingRepositories;



    @Override
    public Ratings createRating(Ratings ratings) {
        return ratingRepositories.save(ratings);
    }

    @Override
    public Optional<Ratings> getRating(Integer ratingId) {
        return ratingRepositories.findById(ratingId);
    }

    @Override
    public List<Ratings> getAllRatings() {
        return ratingRepositories.findAll();
    }

    @Override
    public List<Ratings> getRatingsByUserId(Integer userId) {
        return ratingRepositories.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingsByHotelId(Integer hotelId) {
        return ratingRepositories.findByHotelId(hotelId);    }
}
