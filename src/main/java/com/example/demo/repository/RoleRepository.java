package com.example.demo.repository;

import com.example.demo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query(value = "select * from Role where name=?",nativeQuery = true)
    Role findRoleByName(String name);

    @Modifying
    @Transactional
    @Query(value = "insert into Role(name) values(?) ",nativeQuery = true)
    void insertRole(String name);
}
