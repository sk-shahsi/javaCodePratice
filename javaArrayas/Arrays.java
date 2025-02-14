package javaArrayas;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(10);
        arrays.add(50);
        arrays.add(60);
        arrays.add(80);
        arrays.add(100);
        System.out.println("printing the arrays"+arrays);

        arrays.add(1,2);
        System.out.println(arrays);

        arrays.set(2,300);
        System.out.println(arrays);
        arrays.remove(2);
        System.out.println(arrays);


        System.out.println(arrays.size());

        System.out.println(arrays.toString());


    }
}
