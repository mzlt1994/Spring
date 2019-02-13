package com.icbc.service.impl;

import com.icbc.service.Shopped;
import org.springframework.stereotype.Service;

@Service("shopped")
public class ShopImpl implements Shopped {
    @Override
    public void insertMoney(Double money) {
        System.out.println("花了多少钱");

    }
}
