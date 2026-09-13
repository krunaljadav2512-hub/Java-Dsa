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
    public static List<Integer> permutationEquation(List<Integer> p){
        List<Integer> y = new ArrayList<>();
        
        for(int x = 1; x <= p.size(); x++){
            
            for(int i = 0; i < p.size(); i++){
                if(x == p.get(i)){
                    for(int j = 0; j < p.size(); j++){
                        if(i+1 == p.get(j)){
                            y.add(j + 1);
                            break;
                        }
                    }
                    break;    
                }
            }       
            
        }
        return y;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> p = new ArrayList<>();
        for(int i = 0; i < n; i++){
            p.add(sc.nextInt());
        }
        List<Integer> result = permutationEquation(p);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
