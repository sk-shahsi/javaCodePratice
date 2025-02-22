package Test;

import java.util.*;

public class Test22 {
    private static int[] printArray(int size){
        int[] arr = new int[size];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count<= size){
                arr[i]= count;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString( printArray(5)));

    }
}
