import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution{
    public static int minimumDistances(int arr[]){
        int minDis = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++){
            
            for(int j = i + 1; j < arr.length; j++){
                
                if(arr[i] == arr[j]){
                    if(j - i < minDis){
                        minDis = j - i;
                    }
                }
            }
        }
        
        if(minDis == Integer.MAX_VALUE){
            return -1;
        }
        
        return minDis;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = minimumDistances(arr);
        System.out.print(result);
    }
}