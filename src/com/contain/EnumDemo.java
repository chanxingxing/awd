package com.contain;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumDemo {
    public ColorEnum colorEnum;

    @Test
    public void test1(){
        colorEnum = ColorEnum.FREE;
        System.out.println(colorEnum);
        System.out.println(colorEnum.toString());
    }

    @Test
    public void test(){
        List<String> stringList = Arrays.asList(
                "james","curry","mars"
        );
        if (stringList.size()>2){
            System.out.println(ColorEnum.GREEN.getMsg());
        }
    }
}
