import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
    int minvalue= Integer.MAX_VALUE;
    int maxprofit =0;
    for(int i=0;i<prices.size();i++){
        minvalue = Math.min(prices.get(i),minvalue);
        maxprofit = Math.max(maxprofit,prices.get(i)-minvalue);
    }
    return maxprofit;
    }
}
