package com.mars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("mars",38,9999),
                new Employee("chan",37,8888),
                new Employee("shuming",34,8774)
        );
        List<Employee> employeeList1 = employeeList.stream().filter(employee -> employee.getSalary()>9000).collect(Collectors.toList());
        for(Employee emp:employeeList1){
            System.out.println(emp.getSalary());
        }
        System.out.println("-----------------");
        List<String> nameList = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        for (String name:nameList){
            System.out.println(name);
        }

    }
}
