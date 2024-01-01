package com.example.demo.service;

import com.example.demo.repository.OpeningScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Service
public class OpeningScheduleService {
    @Autowired
    private OpeningScheduleRepository openingScheduleRepository;

    public void insertOpeningSchedule(Scanner scanner){
        System.out.println("Mời bạn nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày bắt đầu(dd/MM/yyyy):");
        LocalDate startDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Mời bạn nhập ngày học");
        String studyDay = scanner.nextLine();
        System.out.println("Mời bạn nhập thời gian học");
        String studyTime = scanner.nextLine();
        openingScheduleRepository.insertOpeningSchedule(address,startDate,studyDay,studyTime);
    }
}
