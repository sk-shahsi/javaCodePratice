package Test;

import java.util.Arrays;

public class Test27 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeduplicate(arr));

    }
    public static  int removeduplicate(int[] x){
        System.out.println(x.length+" without -1");
        System.out.println(x.length-1);
        if(x.length==0)return 0;
        int index=1;
        for (int i=1;i< x.length;i++){
            if(x[i]!=x[i-1]){
                x[index]=x[i];
                index++;
            }

        }
        return index;

    }
}
