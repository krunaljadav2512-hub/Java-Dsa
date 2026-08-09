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
    public static void circularArrayRotation(List<Integer> a, int k, List<Integer> queries){
        
        int n = a.size();
        
        k = k % n; 
        
        for(int i = 0; i < queries.size(); i++){
            int finalIndex = queries.get(i);
            
            int originalIndex = (finalIndex - k + n) % n;
            
            System.out.println(a.get(originalIndex));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        List<Integer> queries = new ArrayList<>();
        for(int i = 0; i < q; i++){
            queries.add(sc.nextInt());
        }
        circularArrayRotation(a, k, queries);
    }    
}
