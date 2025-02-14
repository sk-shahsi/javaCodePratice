package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//      Output: [7, 6, 3, 4, 1, 5, 2]{15, 17, 58, 36, 98, 24, 78};
    //    Output: [7, 6, 3, 4, 1, 5, 2]
public class Test10 {
      public static void main(String[] args) {
          int []arr={15, 17, 58, 36, 98, 24, 78};

          List<Integer> result= findRanking(arr);
          System.out.println(result);

      }
      public static List<Integer> findRanking(int arr[]){
         List<Integer> value= new ArrayList<>();
          for(int i=0;i<arr.length;i++){
              value.add(i);

          }
          value.sort(Comparator.comparingInt(i->arr[i]));
          value.replaceAll(i->i+1);

          return value;
      }

}
