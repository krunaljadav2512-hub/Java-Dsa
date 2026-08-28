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
    public static int designerPdfViewer(int h[], String word){
        int max = 0;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(max < h[index]){
                max = h[index];
            }
        }
        int Area = max * word.length();
        
        return Area;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h[] = new int[26];
        for(int i = 0; i < h.length; i++){
            h[i] = sc.nextInt();
        }
        String word = sc.next();
        
        int result = designerPdfViewer(h, word);
        System.out.print(result);
    }
}
