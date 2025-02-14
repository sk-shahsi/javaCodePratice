package Test;

import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) {
        String s = "aashish";
        findcharacter(s);


    }
    public static void findcharacter(String s){
        HashMap<Character,Integer> mapoccurannce =new HashMap<>();
        for (char c : s.toCharArray()){

            mapoccurannce.put(c,mapoccurannce.getOrDefault(c,0)+1);
        }
        System.out.println("Character Occurance");
        for (Character c:mapoccurannce.keySet()){
            System.out.println(c+": " +mapoccurannce.get(c));
        }
    }
}
