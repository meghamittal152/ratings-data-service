package com.test.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.ratingsdataservice.models.Rating;
import com.test.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
	
	@RequestMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getuserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		List<Rating> ratings = Arrays.asList(
				new Rating("100", 3),
				new Rating("200", 4));
		 userRating.setUserRating(ratings);
		 return userRating;
		
		
	}

}
