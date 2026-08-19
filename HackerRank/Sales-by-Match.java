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
    public static int sockMerchant(int n, int arr[]){
        int pairs = 0;
        for(int i = 0; i < n - 1; i++){
           for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
           }
        }
        int j = 0;
        while(j < n - 1){
          if(arr[j] == arr[j + 1]){
            pairs++;
            j += 2;
          }
          else{
            j++;
          }
        }
        return pairs;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = sockMerchant(n, arr);
        System.out.print(result);
        sc.close();
    }
}
