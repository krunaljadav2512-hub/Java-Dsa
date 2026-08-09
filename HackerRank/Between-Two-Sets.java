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
    public static int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a, int b){
        return (a / GCD(a, b)) * b;
    }
    public static int getTotalX(int n, int m,int arr1[], int arr2[]){
        int lcm_arr1 = arr1[0];
        int gcd_arr2 = arr2[0];
        
        for(int i = 1; i < n; i++){
           lcm_arr1 = LCM(lcm_arr1, arr1[i]);
        }
        for(int i = 1; i < m; i++){
            gcd_arr2 = GCD(gcd_arr2, arr2[i]);
        }
        int count = 0;
        for(int i = lcm_arr1; i <= gcd_arr2; i+=lcm_arr1){
            if(gcd_arr2 % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < m; j++){
            arr2[j] = sc.nextInt();
        }
        int result = getTotalX(n, m, arr1, arr2);
        System.out.print(result);
    }
}
