package com.java.coreTest;
import java.util.*;
public class Test6 {
int age;
String name;
    public Test6(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Test6{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class shortingExample{
    public static void main(String[] args) {
        List<Test6> people= new ArrayList<>();
        people.add(new Test6(25,"aashish"));
        people.add(new Test6(26,"ranjan"));
        people.add(new Test6(40,"raj"));
        Collections.sort(people, Comparator.comparing(Test6::getName));
        for (Test6 t6:people){
            System.out.println(t6);
        }
    }
}
