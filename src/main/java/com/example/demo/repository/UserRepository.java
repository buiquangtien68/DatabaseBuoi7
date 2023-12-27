package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from Users where id=?", nativeQuery = true)
    User findByUserId(int id);

    //Khi để native query thì câu query phải đúng y hệt như tron db
    @Query(value = "select * from Users where role_id = ?", nativeQuery = true)
    List<User> findUserByRoleId(int roleId);

    @Query(value = "select * from Users where name =?",nativeQuery = true)
    List<User> findUserByName(String name);
}
