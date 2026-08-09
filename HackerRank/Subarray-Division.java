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
    public static void birthday(int n, int arr[], int d, int m){
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < m; i++){
            sum += arr[i];
        }
        if(sum == d){
            count++;
        }
        for(int i = m; i < n; i++){
            sum = sum - arr[i - m] + arr[i];
            if(sum == d){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chocolate[] = new int[n];
        
        for(int i = 0; i < n; i++){
            chocolate[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        
        birthday(n, chocolate, d, m);
    }
}
