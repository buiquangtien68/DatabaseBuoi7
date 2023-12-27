package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void findUserById(int id){
        User user = userRepository.findByUserId(id);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Ko tìm thấy user có id "+id);
    }

    public void findUsersByName(String name){
        List<User> usersByNameList = userRepository.findUserByName(name);
        if (usersByNameList.isEmpty())
            System.out.println("Ko tìm thấy kết quả");
        else System.out.println(usersByNameList);

    }
}
