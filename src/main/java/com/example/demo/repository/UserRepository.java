package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from Users where id=?", nativeQuery = true)
    User findByUserId(int id);

    //Khi để native query thì câu query phải đúng y hệt như tron db
    @Query(value = "select * from Users where role_id = ?", nativeQuery = true)
    List<User> findUserByRoleId(int roleId);

    @Query(value = "select * from Users where name =?",nativeQuery = true)
    List<User> findUserByName(String name);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `users` (`email`, `phone`, `account_banking_id`, `name`, `role_id`) VALUES (?,?,?,?,?)",nativeQuery = true)
    void insertUser(String email, String phone, int accountBankingId, String name,int roleId);

    @Modifying
    @Transactional
    @Query(value = "DELETE from Users where id=?",nativeQuery = true)
    void deleteUserById(int id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Users set name = ?2 where id =?1 ",nativeQuery = true)
    void updateUser(int id, String name);

}
