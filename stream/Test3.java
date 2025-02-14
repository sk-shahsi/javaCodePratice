package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        Integer arr[]={1,5,5,9,6,3,4,8,9,6,5,6,};

        Stream<Integer> arr1=Arrays.stream(arr).distinct();
        arr1.sorted().collect(Collectors.toList()).forEach(System.out::println);

        Stream<Integer>a= Arrays.stream(arr).filter(x->x%2 !=0);
        
    }
}
