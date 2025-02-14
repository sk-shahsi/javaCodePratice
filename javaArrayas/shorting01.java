package javaArrayas;

//sellection short
public class shorting01 {
    public static void main(String[] args) {
    int arr1[] ={1,5,8,6,4,8,3,5,9,6,2,88,22,55
    };
    Selectionshort(arr1);
    }
    public static void Selectionshort(int arr[] ){
        for(int i=0; i<arr.length-1; i++){
            int minval=arr[i];
            int minindex=i;

            for (int j=i+1;j<arr.length;j++){
               if(arr[j] < minval){
                   minval = arr[j];

                   minindex = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr [minindex] = temp;
        }
        for (int val : arr){
            System.out.println(val);
        }
    }
}
