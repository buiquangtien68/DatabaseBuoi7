package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

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

    public void findUsersByName(Scanner scanner){
        System.out.println("Mời bạn nhập tên muốn tìm");
        String name = scanner.nextLine();
        List<User> usersByNameList = userRepository.findUserByName(name);
        if (usersByNameList.isEmpty())
            System.out.println("Ko tìm thấy kết quả");
        else System.out.println(usersByNameList);
    }

    public void insertUser(Scanner scanner){
        System.out.println("Mời bạn nhập email:");
        String email = scanner.nextLine();
        System.out.println("Mời bạn nhập số đt: ");
        String phone = scanner.nextLine();
        System.out.println("Mời bạn nhập account banking id:");
        int accBankingId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập role id:");
        int roleId = Integer.parseInt(scanner.nextLine());
        userRepository.insertUser(email,phone,accBankingId,name,roleId);
    }
    public void deleteUser(Scanner scanner){
        System.out.println("Mời bạn nhập id muốn xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        userRepository.deleteUserById(id);
    }

    public void updateUser(Scanner scanner){
        System.out.println("Mời bạn nhập id User:");
        int id = Integer.parseInt(scanner.nextLine());
        findUserById(id);
        if (userRepository.findByUserId(id)!=null) {
            System.out.println("Mời bạn nhập tên muốn thay đổi");
            String name = scanner.nextLine();
            userRepository.updateUser(id, name);
        }
    }
}
