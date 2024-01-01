package com.example.demo.service;

import com.example.demo.entities.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

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

    public void insertCourse(Scanner scanner){
        System.out.println("Mời bạn nhập mô tả khóa học:");
        String description = scanner.nextLine();
        System.out.println("Mời bạn nhập tên khóa học:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá khóa học:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập time line khóa học:");
        String timeLine = scanner.nextLine();
        System.out.println("Mời bạn nhập kiểu khóa học:");
        String typeCourse = scanner.nextLine();
        System.out.println("Mời bạn nhập vote khóa học:");
        int vote = Integer.parseInt(scanner.nextLine());
        courseRepository.insertCourse(description,name,price,timeLine,typeCourse,vote);
    }
}
