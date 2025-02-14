package Test;

import java.util.HashSet;

public class Test15 {
    public static void main(String[] arg){
        int[] input={100, 200, 4, 6, 5, 7, 9, 20, 24, 23, 22};
        int result=findlongest(input);
        System.out.println(result);
    }

    public static int findlongest(int [] nums){
        if(nums == null || nums.length==0)
            return 0;

        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLength=0;
        int startElement =1;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int CurentLength=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    CurentLength++;

                }
                if(CurentLength>maxLength){
                    maxLength = CurentLength;
                    startElement = num;
                }
            }
        }
        return startElement;
    }
}

