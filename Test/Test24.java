package Test;

public class Test24 {
    public static void main(String[] args) {
        String s= "aashish";
        String a="";
        for (int i = s.length()-1; i >=0; i--) {
            char ss=s.charAt(i);
             a=String.valueOf(ss);

            System.out.println(ss);

        }
        System.out.println(a==s);
    }
}
