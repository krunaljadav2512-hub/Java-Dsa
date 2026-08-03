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

class Solusion{
    public static void staircase(int n){
        for(int i = 1; i <= n; i++){
            for(int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        staircase(n);
    }
}
