package com.mskj;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrategyTest {

    @Test
    public void testSpring(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/spring/spring.xml");
        StrategyFactory factory = (StrategyFactory) ctx.getBean("strategyFactory");
        IStrategy strategy = factory.getStrategy(StrategyEnum.PERCENT);
        strategy.handle();
    }

}
