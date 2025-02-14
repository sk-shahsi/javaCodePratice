package javaArrayas;

import java.util.ArrayList;

public class removeevennumbefromlist {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(10);
        list.add(56);
        list.add(5);
        list.add(9);
        list.add(22);
        System.out.println(list);
        for (int i =list.size()-1;i>=0;i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
