package com.example.demo.view;

import com.example.demo.repository.AccountBankingRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AccountBankingService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;
@Service
public class View {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private AccountBankingService accountBankingService;
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1 - Insert");
        System.out.println("2 - Delete");
        System.out.println("3 - Update");
        System.out.println("4 - Find By Name");
        System.out.println("5 - Insert AccBanking");
        System.out.println("Mời bạn chọn:");
        int select = Integer.parseInt(scanner.nextLine());
        switch (select){
            case 1:
                userService.insertUser(scanner);
                break;
            case 2:
                userService.deleteUser(scanner);
                break;
            case 3:
                userService.updateUser(scanner);
                break;
            case 4:

                userService.findUsersByName(scanner);
                break;
            case 5:
                accountBankingService.insertAccount(scanner);
        }
    }
}
