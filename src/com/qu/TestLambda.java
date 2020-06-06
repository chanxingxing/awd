package com.qu;

public class TestLambda {
    public static void main(String[] args) {
        Integer i1 = oper(100,(x)->x*x);
        System.out.println(i1);
    }
    public static Integer oper(Integer i,MyMath myMath){
        return myMath.getValue(i);
    }
}
