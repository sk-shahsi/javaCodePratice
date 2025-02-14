package javaArrayas;

import java.util.HashMap;

public class MaxFromArrays {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String  input="This this is is done by Saket Saket";
        String [] words= input.split(" ");
        HashMap<String,Integer> wordCount= new HashMap<>();
        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);

            }else{
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
    }
}
//Input: "This this is is done by Saket Saket";

//Output: {Saket=2, by=1, this=1, This=1, is=2, done=1}