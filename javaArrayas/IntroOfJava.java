package javaArrayas;

import sun.applet.Main;

public class IntroOfJava {
    public static void main(String[] args) {
        int arr1[] ={1,8,5,6,9,3};
        System.out.println(arr1[4]);
        arr1[4]=10;
        System.out.println(arr1[4]);
        System.out.println(arr1.length);

        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
