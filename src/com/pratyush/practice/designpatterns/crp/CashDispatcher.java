package com.pratyush.practice.designpatterns.crp;

public abstract class CashDispatcher {

    protected CashDispatcher next;
    protected int value;

    public String count(int money){

        int count = money/value;
        money%=value;

        StringBuilder sb = new StringBuilder();
        if(count!=0) sb.append(value).append(" - ").append(count).append("\n");

        if(money> 0 && next != null) sb.append(next.count(money));
        else if(money!=0) throw new RuntimeException("Can't dispatch selected amount");

        return sb.toString();
    }

}
