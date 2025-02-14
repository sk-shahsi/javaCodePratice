package lambda;
//Array { 10, 8, 9, 5, 6, 4}
//        find the 2nd highest element
//        Output - 9

import java.util.*;

public class Test33 {
    public static void main(String[] args) {

        int [] arr ={10, 8, 9, 5, 6};
      //  System.out.println(findSecondhiest(arr));
       int a= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(a);
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(8);
       Optional<Integer> x = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(x.get());

       List<Employee> listOFEmployee= Arrays.asList(new Employee(1,"ashi",50000),
               new Employee(2,"abhi",6000),new Employee(5,"raj",9000));
      Employee e= listOFEmployee.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println(e);


    }

}
class Employee{
    int id;
    String name;
     double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
