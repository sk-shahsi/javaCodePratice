package javaArrayas;

public class TwoDArrays {
    public static void main(String[] args) {
        int [][]arr= new int[5][6];
        //to check the length
        System.out.println("length "+arr.length);
        //set the value
        arr[0][0] =10;
        //get the value
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        //row count
        System.out.println("row "+arr.length);

        //colum count
        System.out.println("colum "+arr[0].length);

        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr[0].length;j++){
                System.out.print(j);
            }

        }
    }
}
