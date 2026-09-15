import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    public static int flatlandSpaceStations(int n, int arr[]){
        Arrays.sort(arr);
        
        int maximum = arr[0];
        for(int i = 1; i < arr.length; i++){
            int gap = (arr[i] - arr[i -1])/2;
            
            maximum = Math.max(gap, maximum);
        }
        
        int lastGap = (n - 1) - arr[arr.length - 1];
        maximum = Math.max(lastGap, maximum);
        
        return maximum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = flatlandSpaceStations(n, arr);
        
        System.out.print(result);
    }
}