package com.example.demo.repository;

import com.example.demo.entities.AccountBanking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

public interface AccountBankingRepository extends JpaRepository<AccountBanking,Integer> {
    @Modifying
    @Transactional
    @Query(value = "insert into account_banking (account_num,name_bank) values(?,?)",nativeQuery = true)
    void insertAccountBanking(String accountNum,String nameBank );
}
