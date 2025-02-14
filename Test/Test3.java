package Test;
//output : i:3  n: 2  f:1 t:1 e:1

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        String input="states";
        Map<Character, Integer> charcount= new HashMap<>();
        for (char c: input.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0) +1 );
        }
        for (Map.Entry<Character,Integer> entery :charcount.entrySet()){
            System.out.println(entery.getKey()+":"+entery.getValue());
        }
    }

}
//
