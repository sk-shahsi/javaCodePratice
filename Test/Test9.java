package Test;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        String s="aashish";

        charCount(s);
    }
    public static void charCount(String str){
        HashMap<Character,Integer> map= new HashMap<>();

        for (char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for (char c: map.keySet()){
            System.out.println(c+":"+map.get(c));
        }
    }
}
