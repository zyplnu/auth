package com.mskj;

public enum StrategyEnum {

    PERCENT(1 , "占比"),
    DEBIT(2 , "借贷");

    private int code;
    private String name;

    StrategyEnum(int code , String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static StrategyEnum findValue(String name){
        for(StrategyEnum enums : StrategyEnum.values()){
            if(name.equals(enums.getName())){
                return enums;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "StrategyEnum{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
