import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
       
    
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<n;i++){
                int j = arr.get(i); 
                if(hs.contains(j)){
                    return j;
                }else{
                    hs.add(j);
                }
            }
        return -1;
    }
}
