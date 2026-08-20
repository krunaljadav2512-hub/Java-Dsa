import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    public static String catAndMouse(int x, int y, int z){
        int A = Math.abs(x - z);
        int B = Math.abs(y - z);
        
        if(A < B){
            return "Cat A";
        }
        else if(A > B){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            System.out.println(catAndMouse(x, y, z));
        }
    }
}
