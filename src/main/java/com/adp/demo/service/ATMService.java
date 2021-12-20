package com.adp.demo.service;

import com.adp.demo.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class ATMService {

    public Transaction getChange(int bill)
    {
        return new Transaction();
    }

}
