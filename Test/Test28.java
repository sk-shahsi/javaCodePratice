package Test;

public class Test28 {
    public static void main(String[] args) {
        System.out.println(checkingsqure(4));
    }
    public static  int checkingsqure(int x){
        for(int i=x;i>=1;i--){
            if(i*i==x){
                return i;
            } else if (i/x==0) {
                return i;
            }
        }
        return 0;
    }
}
