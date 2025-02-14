package Test;

import java.util.Arrays;

public class Test17 {
    public static int[] swip(int arr[]){
        //int first=arr[0]; int
        int [] rotate= new int[arr.length];
        for (int i = 0; i <arr.length-1 ; i++) {
            rotate[i]=arr[i+1];
           // arr[arr.length-1]=first;
        }
        rotate[arr.length-1]=arr[0];
        return rotate;
    }

    public static void main(String[] args) {
        int [] input={1,2,3}; //2,3,1
        Test17 t= new Test17();
        System.out.println(Arrays.toString(swip(input)));

    }
}
