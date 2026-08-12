import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    public static int jumpingOnClouds(int c[], int k){
        int e = 100;
        int i = 0;
        do{
            i = (i + k) % c.length;
            if(c[i] == 1){
                e = e - 2;
            }
            e--;
        }
        while(i != 0);
        
        return e;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c[] = new int[n];
        
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.print(result);
    }
}
