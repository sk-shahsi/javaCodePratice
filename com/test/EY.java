package com.test;
//Find the king element in O(n) time complexity IP: [31,4,7,15,1,8,9] OP: [31,15,9]


import java.util.ArrayList;
import java.util.List;

public class EY {

    public static void main(String[] args) {

    int arr[] ={};
        System.out.println(findkingElement(arr));
    }



    public  static List<Integer> findkingElement(int [] arr){


     List<Integer> king= new ArrayList<>();
     int x=arr.length;
        if(arr.length==0){

            return king;
        }
     int currentmax=  arr[x-1];
     king.add(currentmax);
        for (int i = x-2; i >=0 ; i--) {
            if(arr[i] >currentmax){
                king.add(arr[i]);
                currentmax=arr[i];

            }
        }
        return king;

        }

}
