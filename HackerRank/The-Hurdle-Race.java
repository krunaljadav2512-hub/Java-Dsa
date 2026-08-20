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
    public static int hurdleRace(int k, int arr[]){
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        if(max > k){
            return max - k;
        }
        
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int height[] = new int[n];
        
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.print(result);
    }
}
