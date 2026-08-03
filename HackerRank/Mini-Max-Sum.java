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
    public static void miniMaxSum(int arr[]){
        long min = arr[0];
        long max = arr[0];
        long total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print((total - max) + " " + (total - min));
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        miniMaxSum(arr);
    }
}
