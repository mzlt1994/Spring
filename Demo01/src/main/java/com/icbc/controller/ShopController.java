package com.icbc.controller;

import com.icbc.service.Shopped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    private Shopped shopped;

    public void addMoney(Double money){

        shopped.insertMoney(money);
        System.out.println("花了多少钱");
    }


}
