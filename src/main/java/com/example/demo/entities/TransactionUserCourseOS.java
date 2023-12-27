package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transactionUserCourseOs")
@Data
public class TransactionUserCourseOS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int usersId;
    private int courseId;
    private int transactionHistoryId;
    private int openingScheduleId;
}
