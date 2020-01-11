package com.planner.Trip.Repository;

import com.planner.Trip.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    public List<Review> findReviewsByUserId(Integer userId);
    public List<Review> findReviewsByPlace(String place);
}
