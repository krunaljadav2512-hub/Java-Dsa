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
    public static int migratoryBirds(int n, int arr[]){
        int count[] = new int[n];
        
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        int max = count[1];
        int result = 1;
        
        for(int i = 2; i < n; i++){
            if(count[i] > max){
                max = count[i];
                result = i;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = migratoryBirds(n, arr);
        System.out.print(result);
    }
}
