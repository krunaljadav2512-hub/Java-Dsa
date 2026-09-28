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
    public static String fairRations(List<Integer> B){
        
        int total = 0;
        
        for(int i = 0; i < B.size() - 1; i++){
            
            if(B.get(i) % 2 != 0){
                
                B.set(i, B.get(i) + 1);  
                B.set(i + 1, B.get(i + 1) + 1);
                
                total += 2;
            }
        }
        
        if(B.get(B.size() - 1) % 2 != 0){
            return "NO";
        }
        
        String ans = String.valueOf(total);
        
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> B = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            B.add(sc.nextInt());
        }
        
        String result = fairRations(B);
        
        System.out.print(result);
    }
}
