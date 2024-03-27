package dev.manav.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping()
   public Review createReview(@RequestBody Map<String, String> payload) {
       return reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId"));
   }
}
