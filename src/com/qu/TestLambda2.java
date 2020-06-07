package com.qu;

import com.mars.Employee;
import com.mars.Status;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambda2 {
    List<Employee> employeeList = Arrays.asList(
            new Employee("mars",38,9999, Status.FREE),
            new Employee("chan",37,8888,Status.BUSY),
            new Employee("james",34,8774,Status.VOCATION)
    );

    @Test
    public void test1(){
        //employeeList.stream().allMatch(e->e.getStatus().equals(Status.BUSY));
        //
        // employeeList.stream().filter(e->e.getSalary()>8000).forEach(System.out::println);
       // employeeList.stream().allMatch(e->false);
//       Integer integer= employeeList.get(0).getSalary();
//        System.out.println(integer);
        //employeeList.stream().filter(e->e.getSalary()>8000).forEach(employee -> System.out.println(employee.getSalary()));
        employeeList.stream().filter(employee -> employee.getSalary()>8000).collect(Collectors.toList());
    }

}
