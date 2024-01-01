package com.example.demo.service;

import com.example.demo.repository.AccountBankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Scanner;

@Service
public class AccountBankingService {
    @Autowired
    private AccountBankingRepository accountBankingRepository;
    public void insertAccount(Scanner scanner){
        System.out.println("Mời bạn nhập acc num:");
        String accNum = scanner.nextLine();
        System.out.println("Mời bạn nhập name bank");
        String nameBank = scanner.nextLine();
        accountBankingRepository.insertAccountBanking(accNum,nameBank);

    }
}
