package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(10,12,45,69,67,63,22,55,55);
        Set<Integer> newlist = new HashSet<>();
        l.stream().filter(x->!newlist.add(x)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
