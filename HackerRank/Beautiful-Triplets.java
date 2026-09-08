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
    public static int beautifulTriplets(int d, int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++){
            
            for(int j = i+1; j < arr.length - 1; j++){
                if(arr[j] - arr[i] == d){
                    
                    for(int k = j+1; k < arr.length; k++){
                        if(arr[k] - arr[j] == d){
                            count++;
                            break;
                        }
                        if(arr[k] - arr[j] > d){
                            break;
                        }
                    }
                }
                if(arr[j] - arr[i] > d){
                    break;
                }
                
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.print(result);
    }
}