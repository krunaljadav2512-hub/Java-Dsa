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
    public static int beautifulDays(int a, int b, int k){
        int count = 0;
        
        while(a <= b){
            int temp = a;
            int r = 0;
            int rnum = 0;
            
            while(temp > 0){
                r = temp % 10;
                rnum = (rnum * 10) + r;
                temp = temp / 10;
            }
            int diff = Math.abs(a - rnum);
            
            if(diff % k == 0){
                count++;
            }
            a++;
        }
        return count;    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        int result = beautifulDays(i, j, k);
        System.out.print(result);
    }
}
