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
    public static int diagonalDifference(int size, int matrix[][]){
        int ltr = 0;
        int rtl = 0;
        
        for(int i = 0; i < size; i++){
            ltr += matrix[i][i];
            rtl += matrix[i][size - 1 -i];
        }
        
        return Math.abs(ltr - rtl);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int matrix[][] = new int[size][size];
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = diagonalDifference(size,matrix);
        System.out.println(result);
    }
}
