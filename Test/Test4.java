package Test;

import javaArrayas.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Input: [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
public class Test4 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for (int[] interval : result)
        { System.out.println(interval[0]);
        } }


    public static int[][] merge(int[][] intervals) {
       // Arrays.sort(intervals ,(x,y)->Integer.compare(x[0], y[0]));
        List<int[]> merg= new ArrayList<>();
        int []  currentReve = intervals[0];
        merg.add(currentReve);
        for (int [] interval: intervals){
            int End= currentReve[1];
            int nextStart= interval[0];

            int nextEnd = interval[1];
            if (End >= nextStart){
                currentReve[1] = Math.max(End,nextEnd);

            }else {
                currentReve = interval;
                merg.add(currentReve);
            }
        }
        return merg.toArray(new int[merg.size()][]);

    }

}
