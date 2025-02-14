package Test;

import java.util.Arrays;
import java.util.HashMap;

//aashish
public class Test5 {
    public static void main(String[] args) {
        String s= "aashishi";
        char []arr=s.toCharArray();
       // System.out.println(arr.length);
        String str="";



        System.out.println();
       for (int i=arr.length-1;i>=0;i--){
           //System.out.println(arr[i]);

           str +=arr[i];


       }
        System.out.println("reverse String = "+str);
       char nonrepted=findnonreptedChar(str);
       if(nonrepted !=0){
           System.out.println(nonrepted);
       }else {
           System.out.println("Notfound");
       }

    }
    public static char findnonreptedChar(String str){
        HashMap<Character,Integer> frquencymap= new HashMap<>();
        for(char c:str.toCharArray()){
            frquencymap.put(c, frquencymap.getOrDefault(c,0)+1);

        }
        for (char c:str.toCharArray()){
            if(frquencymap.get(c) == 1){

                //System.out.println(c);
                return c;

            }

        }
        return 0;
    }
}
