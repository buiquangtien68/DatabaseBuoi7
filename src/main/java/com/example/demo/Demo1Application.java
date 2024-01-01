package com.example.demo;


import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CourseService;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import com.example.demo.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;

@SpringBootApplication
public  class Demo1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private View view;

    @Override
    public void run(String... args) throws Exception {

       /* System.out.println("Mời bạn nhập id muốn tìm");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        userService.findUserById(id);
        System.out.println();
        System.out.println("Mời bạn nhập tên:");
        String name = new Scanner(System.in).nextLine();
        userService.findUsersByName(name);
        System.out.println();
        System.out.println("Mời bạn nhập tên role");
        String roleName = new Scanner(System.in).nextLine();
        roleService.findRoleByName(roleName);
        System.out.println();
        System.out.println("Các khóa học 6 tháng (tim_line) và có giá là 2000000 và vote >3:");
        courseService.findCourseByTimeLineAndPriceAndVote();
        System.out.println();
        System.out.println("Mời b nhập tên role muốn thêm:");
        String newRoleName = new Scanner(System.in).nextLine();
        roleService.insertRole(newRoleName);*/
        view.menu();

    }
}
