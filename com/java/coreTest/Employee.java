package com.java.coreTest;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(25, "Ajay");
        Employee e2 = new Employee(28, "Kiran");
        Employee e3 = new Employee(24, "Birat");
        Employee e4 = new Employee(25, "Jaya");
        Employee e5 = new Employee(22, "Ajay");
        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
       // employees.stream().sorted(Comparator.comparing())
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
   // write a comparator using lambda to sort based on Age, provided if two objects having same age, they should be sorted based on name
  //      comparator to sort based on name