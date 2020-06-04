package com.mars;

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;

import java.util.Arrays;
import java.util.List;


/**
 *
 */
public class Lambda {
    public static void main(String[] args) {
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");


            }
        };
        new Thread(runnable).start();

        Runnable runnable1 = () ->{System.out.println("lambda...");};
        new Thread(runnable1).start();
        new Thread(()->System.out.println("lambda!!!!")).start();*/
        List<String> list = Arrays.asList("djsd","hds");
        for(String str:list){
            System.out.println(str);
        }
    }
}
