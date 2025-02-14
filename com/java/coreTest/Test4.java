package com.java.coreTest;

import java.util.*;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> listofInteger = Arrays.asList(1,53,6,8,9,4,5,1,8);
        long l=listofInteger.stream().mapToInt(Integer::intValue).sum();
        System.out.println(l);
       Set<Integer> duplicat=listofInteger.stream().filter(n->listofInteger.indexOf(n)!= listofInteger.lastIndexOf(n)).collect(Collectors.toSet());
        System.out.println(duplicat);
    }
}
