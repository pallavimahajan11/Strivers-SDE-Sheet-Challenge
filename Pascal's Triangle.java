import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
            ArrayList<ArrayList<Long>> al = new ArrayList<ArrayList<Long>>();
			for(int i=1;i<=n;i++){
				al.add(row(i));
			}
			return al;
	}
	public  static ArrayList<Long> row(int r){
     ArrayList<Long> ls = new ArrayList<>();
	 long ans = 1;
	 ls.add(ans);
	 for(int i=1;i<r;i++){
		 ans = ans*(r-i);
		 ans = ans/i;
		 ls.add(ans);
	 }
	 return ls;
	}
}
