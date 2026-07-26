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
    public static void compareTriplets(int a[], int b[]){
       int alice = 0, bob = 0;
       int i = 0;
        while(i < 3){
         if(a[i] > b[i]){
            alice++;
         }
         if(b[i] > a[i]){
            bob++;
         }
         i++;   
        }
        System.out.println(alice+" "+bob);
    }
    public static void main(String args[]){
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < 3; j++){
            arr2[j] = sc.nextInt();
        }
        
        compareTriplets(arr1,arr2);
    }
        
}
