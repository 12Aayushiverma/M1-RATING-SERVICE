package com.example.RatingService.controller;

import com.example.RatingService.entities.Ratings;
import com.example.RatingService.services.RatingServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingServices ratingServices;

    private final static Logger log = LoggerFactory.getLogger(RatingController.class);


    @PostMapping
    public ResponseEntity<Ratings> createRatings(@RequestBody Ratings ratings){
        log.info("RatingController::createRatings===START ");
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.createRating(ratings));
    }


    @GetMapping("/{ratingId}")
    public ResponseEntity<Optional<Ratings>> getRating(@PathVariable Integer ratingId){
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getRating(ratingId));
    }


    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Ratings>> getRatingByUserId(@PathVariable Integer userId){
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getRatingsByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratings>> getRatingByHotelId(@PathVariable Integer hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getRatingsByHotelId(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Ratings>> getAllRatings(){
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getAllRatings());
    }


}
