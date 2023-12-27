package com.example.demo.service;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleReponsitory;

    public void findRoleByName(String name){
        List<Role> roleListByName = roleReponsitory.findRoleByName(name);
        if (roleListByName.isEmpty())
            System.out.println("không có dữ liệu");
        else System.out.println(roleListByName);
    }
}
