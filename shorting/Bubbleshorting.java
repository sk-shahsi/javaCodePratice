package shorting;

public class Bubbleshorting {
    public static void main(String[] args) {

        int x[]={14,15,89,1,5,3};
        bubble(x);

    }
    public static void bubble(int a[]){
        int  temp=0 ;
        for (int i = 0; i < a.length-1; i++) {

            for (int j = 0; j < a.length-1-i ; j++) {
                if(a[j] > a[j+1]){
                     temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
            
        }
        for (int val:a){
            System.out.println(val);
        }

    }
}
