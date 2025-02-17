package Test;

import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        int [] input={7,5,6};
        arr(input);
    }
    public static int []arr(int[] arr){

        int firstElements=arr[0];
        int []array= new int [arr.length];
        int max= arr[arr.length-1];
        if(max>firstElements){
            System.out.println(max);
        } else if (firstElements>max) {
            System.out.println(max);

        }
        Arrays.fill(array,max);
        return array;
    }
}
