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
    public static void angryProfessor(int k, int a[]){
        int atte = 0;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] <= 0){
                atte++;
            }
        }
        if(atte >= k){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            
            angryProfessor(k, a);
        }
    }
}
