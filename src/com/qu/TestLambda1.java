package com.qu;

import java.util.function.Consumer;

public class TestLambda1 {
    public static void main(String[] args) {
        Consumer<Double> con = money ->System.out.println("每次消费"+money);
        con.accept(100d);
    }
}
