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
    public static int pageCount(int n, int p){
        int front = 0;
        int back = 0;
        
        front = p / 2;
        back = n/2 - p/2;
               
        int answer = front;
        if(answer > back){
            answer = back;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = pageCount(n, p);
        System.out.print(result);
    }
}
