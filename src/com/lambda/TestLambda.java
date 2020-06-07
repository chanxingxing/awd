package com.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda {

    List<String> list = Arrays.asList("Hello","world","James");

    @Test
    public void test1(){
        /**
         * map--接受一个lambda,将元素转成其他形式或者提取信息。
         *    --接受一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新元素。
         */
        Stream<String> stream = list.stream().map(s -> s.toUpperCase());
        stream.forEach(s->System.out.println(s));
        //list.stream().map(str->str.toUpperCase()).forEach(s -> System.out.println(s));
    }

    @Test
    public void test2(){
        //Stream<Stream<Character>
       // Stream<Stream<Character>> stream1 = list.stream().map(TestLambda::filterCharacter);
       // Stream<Stream<Character>> stream2 = stream1.limit(2);
        List<Stream<Character>> aList = list.stream().map(TestLambda::filterCharacter).collect(Collectors.toList());


       //list.stream().map(TestLambda::filterCharacter).forEach(sm->sm.forEach(ch->System.out.println(ch)));
        /**
         * flatMap --接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
         */
       list.stream().flatMap(TestLambda::filterCharacter).forEach(System.out::println);
    }

    @Test
    public void test3(){
//       Stream<List<Character>> stream = list.stream().map(TestLambda::filterCharacter1);
//       stream.forEach(li->li.forEach(ch->System.out.println(ch)));

        //list.stream().map(TestLambda::filterCharacter1).forEach(ch->System.out.println(ch));
        list.stream().map(TestLambda::filterCharacter1).forEach(list->list.forEach(System.out::println));
    }

    public static Stream<Character> filterCharacter(String str){
        List<Character> characterList = new ArrayList<>();
        for (Character ch : str.toCharArray()){
            characterList.add(ch);
        }
        return characterList.stream();
    }

    public static List<Character> filterCharacter1(String str){
        List<Character> characterList = new ArrayList<>();

        for (Character ch:str.toCharArray()){
            characterList.add(ch);
        }
        return characterList;
    }

}
