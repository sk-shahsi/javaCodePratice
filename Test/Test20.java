package Test;

import java.util.Arrays;

public class Test20 {
    public static void main(String[] args) {
        int arr[]={1,5,1,};
        int newarr[]=new int[arr.length];
        int max=arr[0];
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int j=0;j<arr.length-1;j++){
            arr[j]= max;
        }
        Arrays.fill(newarr,max);
        System.out.println(Arrays.toString(newarr));

    }


}
