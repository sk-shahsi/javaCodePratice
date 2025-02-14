package com.java.coreTest;

public class Test3 {
    public static void main(String[] args) {
        String s="aashish";
        String empty="";
        for (int i=s.length()-1;i>=0;i--){
            empty=empty+s.charAt(i);
        }
        System.out.println(empty);
    }
}
