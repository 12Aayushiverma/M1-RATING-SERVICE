package com.example.RatingService.services;

import com.example.RatingService.entities.Ratings;

import java.util.List;
import java.util.Optional;

public interface RatingServices {

    public Ratings createRating(Ratings ratings);

    public Optional<Ratings> getRating(Integer ratingId);
    public List<Ratings> getAllRatings();

    public List<Ratings> getRatingsByUserId(Integer userId);

    public List<Ratings> getRatingsByHotelId(Integer hotelId);
}
