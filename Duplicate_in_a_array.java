import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
   HashSet<Integer> hs = new HashSet<>();
   for(int i=0;i<n;i++){
       if(hs.contains(arr.get(i))){
        return arr.get(i);
       }else{
           hs.add(arr.get(i));
       }
   }
   return -1;
    }
}
