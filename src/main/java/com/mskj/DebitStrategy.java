package com.mskj;

import org.springframework.stereotype.Service;

@Service
public class DebitStrategy implements IStrategy {
    @Override
    public void handle() {
        System.out.println("debit process");
    }

    @Override
    public StrategyEnum getEnum() {
        return StrategyEnum.DEBIT;
    }
}
