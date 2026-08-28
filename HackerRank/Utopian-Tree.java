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
    public static int utopianTree(int n){
        int height = 1;
        for(int i = 1; i <= n; i++){
            
            if(i % 2 == 0){
                height += 1;
            }
            else{
                height *= 2;
            }
        }
        return height;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int result = utopianTree(t);
            System.out.println(result);
        }
    }
}
