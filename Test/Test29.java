package Test;

import javaArrayas.Arrays;

public class Test29 {
    public static void main(String[] args) {
        System.out.println(mySqrt(48));
    }
    public  static int mySqrt(int x) {
        for(int i=x;i>=1;i--){
            if(i*i<=x){
                return i;
            }
        }
        return 0;
    }

}
