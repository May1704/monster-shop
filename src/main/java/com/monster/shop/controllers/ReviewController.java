package com.monster.shop.controllers;

import com.monster.shop.models.Product;
import com.monster.shop.models.Review;
import com.monster.shop.services.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    //Get all reviews
    @GetMapping("/api/reviews/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }
}
