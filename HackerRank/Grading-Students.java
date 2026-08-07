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
    public static void gradingStudents(int n, int marks[]){
        
        for(int i = 0; i < n; i++){
            if(marks[i] > 37){
                if((marks[i]+2) % 5 == 0){
                    marks[i] += 2; 
                }
                else if((marks[i] + 1) % 5 == 0){
                    marks[i] += 1;
                }
            }
            System.out.println(marks[i]);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }
        gradingStudents(n,marks);
    }
}
