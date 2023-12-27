package com.example.demo.service;

import com.example.demo.entities.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public void findCourseByTimeLineAndPriceAndVote(){
        List<Course> courseList = courseRepository.findCourseByTimeLineAndPriceAndVote();
        if (courseList.isEmpty())
            System.out.println("Không có dữ liệu");
        else System.out.println(courseList);
    }
}
