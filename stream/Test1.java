package stream;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        arrayList.add(1000);
        arrayList.add(2000);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(200);
        arrayList.add(100);
        arrayList.add(300);
        int count=0;
        for ( Integer salary : arrayList){
            if(salary<= 500){
                count ++;
                System.out.println(salary);
            }

        }
        System.out.println(count);


       Long  a= arrayList.stream().filter(x->x>500).count();

        System.out.println(a);
    }
}
