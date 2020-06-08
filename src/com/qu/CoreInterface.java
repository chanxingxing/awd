package com.qu;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 消费型接口
 * Consumer<T>
 *     void accept(T t);
 *
 * 供给型接口
 * Supplier<T>
 *     T get();
 *
 *  函数型接口
 *  Function<T,R>
 *      R apply(T t);
 *
 *  断言型接口
 *  Predicate<T>
 *      boolean test(T t);
 */
public class CoreInterface {

    @Test
    public void test1(){
        happy(1000d,d-> System.out.println(d));
    }

    public void happy(Double d, Consumer<Double> con){
        con.accept(d);
    }

}
