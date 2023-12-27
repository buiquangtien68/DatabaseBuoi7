package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String timeLine;
    private String description;
    private double price;
    private String typeCourse;
    private int vote;

}
