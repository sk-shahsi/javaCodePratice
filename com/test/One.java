package com.test;

import com.java.coreTest.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class One {

}
class Student{
    int age;
    String name;
    Double salary;

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Student(int age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class mai{

    public static void main(String[] args) {
        List<Student> stu= new ArrayList<>();
        stu.add(new Student(10,"ashis",500.0));
        stu.add(new Student(14,"ranjan",6000.0));
        stu.add(new Student(12,"raj",900.0));
        stu.add(new Student(11,"ravi",800.0));
        stu.add(new Student(16,"aaram",300.0));
       stu.sort(Comparator.comparing(Student::getAge));
      //  stu.forEach(System.out::println);
       // stu.sort(Comparator.comparing(Student::getName));
        for (Student student : stu) {
           // System.out.println("+++"+student);

        }
       // stu.stream().filter(x->x.salary>=500.0).forEach(System.out::println);
       Student a= stu.stream().sorted(Comparator.comparing(Student::getSalary).reversed()).skip(1).findFirst().get();

        System.out.println(a);






    }

}
class sortnumber{


    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,1};
        Arrays.stream(arr).sorted().forEach(System.out::println);

        System.out.println("-------------------------------------");


        for (int i =0;i<= arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i ; j++) {
                int tem =arr[j];
                if (arr[j]>arr[j +1]){
                    arr[j]= arr[j+1];
                    arr[j+1]= tem;
                }

            }
        }
        for (int num: arr){
            System.out.println(num);
        }

    }
}
