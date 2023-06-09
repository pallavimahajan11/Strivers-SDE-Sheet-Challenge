import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

    
            if (sum < 0) {
                sum = 0;
            }
        }

        

        if (maxi < 0) maxi = 0;

        return maxi;

	}

}
