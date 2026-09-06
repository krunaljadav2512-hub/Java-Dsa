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
    public static List<Integer> kaprekarNumbers(int p, int q){
        List nums = new ArrayList<>();
        if(p > q){
            return nums;
        }
        for(long i = p; i <= q; i++){
            long sqr = i * i;
            
            int d = String.valueOf(i).length();
            
            long divisor = (long)Math.pow(10, d);
            
            long l = sqr / divisor;//start
            long r = sqr % divisor;//end
            
            if(l + r == i){
                nums.add(i);
            }
        }
        return nums;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        List<Integer> result = kaprekarNumbers(p, q);
        if(result.isEmpty()){
            System.out.print("INVALID RANGE");
        }
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
