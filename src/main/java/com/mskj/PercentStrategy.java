package com.mskj;

import org.springframework.stereotype.Service;

@Service
public class PercentStrategy implements IStrategy {
    @Override
    public void handle() {
        System.out.println("percent process");
    }

    @Override
    public StrategyEnum getEnum() {
        return StrategyEnum.PERCENT;
    }
}
