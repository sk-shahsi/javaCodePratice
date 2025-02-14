package Test;

import java.util.HashMap;
import java.util.Map;

public class Test11 {

    public static void main(String[] args) {
        String s="aashishhs";
        occurance(s);

    }
    public static void occurance(String str){

        Map<Character,Integer> map=new HashMap<>();
        for (Character c:str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for (char c:map.keySet()){
            System.out.println(c+" = "+map.get(c));
        }
    }

}
