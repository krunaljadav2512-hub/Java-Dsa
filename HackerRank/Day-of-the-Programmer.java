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
    public static String dayOfProgrammer(int yy){
        String answer = "";
        if(yy == 1918){
            answer = "26.09.1918";
        }
        else if(yy < 1918){
            if(yy % 4 == 0){
                answer = "12.09."+yy;
            }
            else{
                answer = "13.09."+yy;
            }
        }
        else{
            if((yy % 400) == 0 || (yy % 4 == 0 && yy % 100 != 0)){
                answer = "12.09."+yy;
            }
            else{
                answer = "13.09."+yy;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String str = dayOfProgrammer(year);
        System.out.print(str);
        sc.close();
    }
}
