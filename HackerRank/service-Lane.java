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
    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases){
        List<Integer> minimum = new ArrayList<>();
        
        for(int i = 0; i < cases.size(); i++){
            int min = Integer.MAX_VALUE;
            int start = cases.get(i).get(0);
            int end = cases.get(i).get(1);
            
            for(int j = start; j <= end; j++){
                if(width.get(j) < min){
                    min = width.get(j);
                }
            }
            minimum.add(min);
        }
        return minimum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> width = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            width.add(sc.nextInt());
        }
        
        List<List<Integer>> cases = new ArrayList<>();
        
        for(int i = 0; i < t; i++){
            List<Integer> row = new ArrayList<>();
            
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            row.add(start);
            row.add(end);
            
            cases.add(row);
        }
        
        List<Integer> result = serviceLane(n, width, cases);
        
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
