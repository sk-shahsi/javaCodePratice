package com.java.coreTest;

public class Test5 {


    public static void main(String[] args) {
        int number =9;
        int number2=1;
        for(int i=1;i<=100;i++){

            System.out.println(i*number);
            number2 =i*number;
            String formatResult=String.valueOf(number2);
            if(formatResult.length()==1){
                System.out.println(formatResult);

            }if (formatResult.length()>=2){
               // int diffrent=number2-formatResult;

            }
        }
        System.out.println(number2);


    }
}
