package com.planner.Trip.Repository;


import com.planner.Trip.Model.Plan;
import com.planner.Trip.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlanRepository extends JpaRepository<User,Long> {
    public List<Plan> findPlansByUserId(Integer userId);

    public Plan findPlansByPlaceId(Integer id);
}
