package com.java.coreTest;

public class TestStaticMethodinInterface implements Test{
    @Override
    public int add(int a, int b) {
        return Test.super.add(a, b);
    }


    public static void main(String[] args) {

        TestStaticMethodinInterface tt= new TestStaticMethodinInterface();
        System.out.println( tt.add(10,23));


        System.out.println( Test.msg("Hello"));
    }

}
interface Test{
    default int add(int a,int b){
        return a+b;
    }
    static String msg(String msg){

        return msg;
    }
}
