package lambda;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class Test1 {
  private final String name;
 private final List<String> strings;

 public Test1(List<String> string ,String name){
     this.strings= Collections.unmodifiableList(string);
     this.name = name;
 }


    public String getName() {
        return name;
    }

    public List<String> getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", strings=" + strings +
                '}';
    }
}
class Singlton{
    private static Singlton Instance;
    private Singlton(){}
    public static Singlton getInstance(){
        if (Instance == null){
            synchronized (Singlton.class){
                if (Instance==null){
                    Instance=new Singlton();
                }
            }
        }
        return Instance;
    }
}

