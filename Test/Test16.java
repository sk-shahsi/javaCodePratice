package Test;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int arr[]={1,2,5,6};

        int res=0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            res+=arr[i];

        }
        System.out.println(res);

        int arr2[]={1,5,6,8};
        int first=arr2[0];
        for (int i = 0; i <arr2.length-1 ; i++) {
            arr2[i]=arr2[i+1];

        }
        arr2[arr2.length-1]=first;
        System.out.println(Arrays.toString(arr2));
    }
}
