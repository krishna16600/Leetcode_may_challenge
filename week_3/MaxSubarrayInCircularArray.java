import java.util.Scanner;

public class MaxSubarrayInCircularArray {
    public int maxSubarraySumCircular(int[] A){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE , sum1 = 0,sum2 = 0, totalSum = 0;

        for(int i=0;i<A.length;i++){
            sum1+=A[i];
            max = Math.max(sum1,max);
            sum1 = Math.max(sum1,0);

            sum2+=A[i];
            min = Math.min(sum2,min);
            sum2 = Math.min(sum2,0);

            totalSum+=A[i];
        }
        return max < 0 ? max : Math.max(totalSum-min,max);
    }
}
