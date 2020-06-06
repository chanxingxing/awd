package com.mars;

public interface Functiondoing<T> {
    default void go(){
        Employee emp = new Employee();
        //emp.setName("张三");
        emp.setAge(10);
        emp.setSalary(93239);
        //emp.setName(this.service(emp));
    }
    void service(T t);
}
