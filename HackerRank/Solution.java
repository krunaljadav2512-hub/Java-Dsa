import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution{
    public static int getMoneySpent(int b, int n, int m, int keyboard[], int USB[]){
        int max = -1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               int sum = keyboard[i] + USB[j];
                if(sum > max && sum <= b){
                    max = sum;
                }
            }
        }
        
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int keyboard[] = new int[n];
        int USB[] = new int[m];
        
        for(int i = 0; i < n; i++){
            keyboard[i] = sc.nextInt();
        }
        
        for(int j = 0; j < m; j++){
            USB[j] = sc.nextInt();
        }    
        
         int result = getMoneySpent(b, n, m, keyboard, USB);
         System.out.print(result);
         sc.close();  
    }
}
