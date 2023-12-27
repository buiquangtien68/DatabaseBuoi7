package com.example.demo.repository;

import com.example.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    @Query(value = "SELECT * FROM Course WHERE time_line = '6 thang'and price=2000000 and vote >3", nativeQuery = true)
    List<Course> findCourseByTimeLineAndPriceAndVote();
}