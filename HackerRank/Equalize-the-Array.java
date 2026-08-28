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
    public static int equalizeArray(int arr[]){
        
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int freq = 1;
        int maxFreq = 1;
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                freq++;
                if(freq > maxFreq){
                    maxFreq = freq;
                }
            }
            else{ 
                freq = 1;
            }
            
        }
        int minFreq = arr.length - maxFreq;
        
        return minFreq;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = equalizeArray(arr);
        System.out.print(result);
    }
}
