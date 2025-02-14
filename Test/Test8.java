package Test;

import java.util.HashMap;

public class Test8 {
    public static void main(String[] args) {
        String s= "name";
        char []arr=s.toCharArray();
        String reverse="";
        for(int i =arr.length-1;i>=0;i--){
            reverse= reverse +arr[i];

        }
        System.out.println("reverse String = "+reverse);
        occuranceCount(s);
    }
    public static void occuranceCount(String srt){
        HashMap<Character,Integer> hashMap= new HashMap<>();
        for (char c:srt.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println("Occurance Of Character");
        for (Character c:hashMap.keySet()){
            System.out.println(c+":"+hashMap.get(c));
        }
    }
}
