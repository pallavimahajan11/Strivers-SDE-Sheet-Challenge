import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int temp[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(arr1[i]<arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }else{
                temp[k] = arr2[j];
                j++;
                k++;
            }

        }
        while(i<m){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp;
    }
}
