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
    public static void kangaroo(int x1, int v1, int x2, int v2){
        if((x1 < x2 && v1 <= v2) || (x2 < x1 && v2 <= v1)){
            System.out.print("NO");
            return;
        }
        if((x1 - x2) % (v2 - v1) == 0){
            System.out.print("YES");
            return;
        }
        else{
            System.out.print("NO");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        kangaroo(x1, v1, x2, v2);
    }
}
