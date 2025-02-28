package Test;

public class Test26
{
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,5,9};
        int val=5;
        System.out.println(count(arr,val));

    }
    public static int count(int[] nums,int val){
        int arr[] = new int[nums.length];
        int count =0;
        //int arr[]= new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if(nums[i] ==val){
                count++;
                continue;
            }else {
               arr[i]=nums[i];
                System.out.println(arr[i]);
            }
        }
        return count;
    }
}
