package com.qu;

import com.mars.Employee;
import com.mars.Status;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda2 {
    List<Employee> employeeList = Arrays.asList(
            new Employee("mars",38,9999,Status.FREE),
            new Employee("chan",37,8888,Status.VOCATION),
            new Employee("shuming",34,8774,Status.FREE)
    );

    @Test
    public void test1(){
//        boolean b = employeeList.stream().allMatch(e->e.getStatus().equals(Status.BUSY));
//        System.out.println(b);
       boolean b =  employeeList.stream().allMatch(e->e.getStatus().equals(Status.BUSY));
        System.out.println(b);

        boolean b1 = employeeList.stream().anyMatch(e->e.getStatus().equals(Status.BUSY));
        System.out.println(b1);
        System.out.println(employeeList.stream().noneMatch(e->e.getStatus().equals(Status.BUSY)));




    }

}
