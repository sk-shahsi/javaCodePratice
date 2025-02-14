package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<List<String>> sentance= Arrays.asList(Arrays.asList("I","LOVE","JAVA"), Arrays.asList("CONCEPT", "ARE","CLEAR"),Arrays.asList("ITS","VERY","EASY"));
       sentance.stream().flatMap((List<String> sen)->sen.stream()).collect(Collectors.toList()).forEach(System.out::println);

      List<String > val1= sentance.stream().flatMap((List<String> sen)->sen.stream().map((String val)-> val.toLowerCase())).collect(Collectors.toList());

        System.out.println(val1);
        for (String  val: val1){
            System.out.println(val);
        }

    }
}