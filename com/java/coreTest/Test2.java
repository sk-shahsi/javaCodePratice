package com.java.coreTest;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,67,8};
        long a=Arrays.stream(arr).count();
        System.out.println("Count of prsent in arrays"+a);
       long sum= Arrays.stream(arr).sum();
        System.out.println("Sum of all arrays number "+sum);

        OptionalDouble avrage=Arrays.stream(arr).average();
        System.out.println("avrage of arrays number"+avrage);

      int secondHigestNumber=  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secon"+secondHigestNumber);

        List<Integer> l= Arrays.asList(1,5,6,9,22);
        Integer sum2=l.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum2);

        List<programer> listofprog= Arrays.asList(new programer("Programmer1", Arrays.asList("Java", "Python", "Angular")),
                new programer("progamer2",Arrays.asList("c","Angular","C++")));
        listofprog.stream().map(programer::getName).collect(Collectors.toList()).forEach(System.out::println);
    }
}

class programer{
    private String name;
    private List<String> skils;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkils() {
        return skils;
    }

    public void setSkils(List<String> skils) {
        this.skils = skils;
    }

    public programer() {
    }

    public programer(String name, List<String> skils) {
        this.name = name;
        this.skils = skils;
    }
}