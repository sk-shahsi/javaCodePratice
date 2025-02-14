package Test;

import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        int qustion[]={4,5,1};
        System.out.println(Arrays.toString(arrmax(qustion)));
    }
    public static int[] arrmax(int[] arr){
        int xx[]=new int[arr.length];
        int max=arr[0];
        for (int num:arr) {
            if(num>max){
                max=num;
            }
            Arrays.fill(xx,max);
        }
        return xx;
    }
}
