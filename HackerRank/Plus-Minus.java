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

class Solusion{
    public static void plusMinus(int n, int arr[]){
        int plus = 0;
        int minus = 0;
        int zero = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                plus++;
            }
            else if(arr[i] == 0){
                zero++;
            }
            else{
                minus--;
            }
        }
        System.out.printf("%.6f\n",Math.abs((float)plus/n));
        System.out.printf("%.6f\n",Math.abs((float)minus/n));
        System.out.printf("%.6f\n",Math.abs((float)zero/n));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        plusMinus(n,arr);
    }
}
