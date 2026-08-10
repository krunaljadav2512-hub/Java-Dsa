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
    public static void benAppetit(int n, int k, int bill[], int b){
        int total = 0;
        
        for(int i = 0; i < n; i++){
            total += bill[i];
        }
        
        int actual = (total - bill[k])/2;
        
        if(actual == b){
            System.out.print("Bon Appetit");
        }
        else{
            System.out.print(b - actual);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bill[] = new int[n];
        
        for(int i = 0; i < n; i++){
            bill[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        benAppetit(n, k, bill, b);
    }
}
