package com.mars;


import java.util.Comparator;
import java.util.function.Consumer;

/**
 * lambda表达式
 * 左侧：lambda表达式的参数  接口抽象方法的参数
 * 右侧：lambda表达式中所需要执行的功能，即lambda体  即抽象方法的实现
 * 语法格式一：无参数，无返回值   () -> System.out.println();
 */
public class Lambda2 {
    public static void main(String[] args) {
        Comparator<Integer> com = (o1, o2) -> {
            System.out.println("lambda");
            return Integer.compare(o1,o2);
        };
        com.compare(3,6);
        test();
    }


    public static void test(){
        Consumer<String> co = (x) ->{
          System.out.println(x);
        };
        co.accept("djksdj");
    }
}
