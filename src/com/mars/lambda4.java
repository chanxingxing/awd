package com.mars;

public class lambda4 {

    public static void main(String[] args) {

    Functiondoing<Employee> doing = emp -> {
        emp.setName("张三");
    };
    doing.go();

    }


}
