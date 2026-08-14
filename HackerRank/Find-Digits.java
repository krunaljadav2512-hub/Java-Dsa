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
    public static int findDigits(int n){
        int digit = 0;
        int temp = n;
        while(temp > 0){
            int d = temp % 10;
            
            if(d != 0 && n % d == 0){
                digit++;
            }
            
            temp = temp / 10;
        }
        return digit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            
            int result = findDigits(n);
            System.out.println(result);
        }
    }
}