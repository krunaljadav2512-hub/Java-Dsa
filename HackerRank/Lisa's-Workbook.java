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
    public static int workbook(int n, int k, int arr[]){
        int special = 0;
        int pages = 1;
        
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 1; j <= arr[i]; j++){
                if(pages == j){
                    special++;
                }
                if(j % k == 0){
                    pages++;
                }
            }
            if (arr[i] % k != 0) {
                pages++;
            }
        }
        return special;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = workbook(n, k, arr);
        
        System.out.print(result);
        
    }
}
