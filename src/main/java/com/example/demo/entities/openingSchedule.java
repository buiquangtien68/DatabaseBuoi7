package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "openingSchedule")
@Data
public class openingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startDate;
    private String address;
    private String studyDay;
    private String studyTime;
}
