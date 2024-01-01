package com.example.demo.repository;

import com.example.demo.entities.OpeningSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.time.LocalDate;

public interface OpeningScheduleRepository extends JpaRepository<OpeningSchedule,Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `opening_schedule` (`address`, `start_date`, `study_day`, `study_time`) VALUES (?,?,?,?)",nativeQuery = true)
    void insertOpeningSchedule(String address, LocalDate startDate, String studyDay, String studyTime);
}
