package com.mskj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyFactory implements ApplicationContextAware {

    private static volatile Map<StrategyEnum , IStrategy> factoryMap  = new HashMap();

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void register(){
        applicationContext.getBeansOfType(IStrategy.class).values().forEach(
                (x) -> {
                    factoryMap.put( x.getEnum() , x);
                }
        );
    }

    public IStrategy getStrategy(StrategyEnum strategyEnum){
        factoryMap.forEach((x , y) -> {
            System.out.println(x + ":" + y);
        });
        if(null == strategyEnum){
            return null;
        }
        return factoryMap.get(strategyEnum);
    }
}
