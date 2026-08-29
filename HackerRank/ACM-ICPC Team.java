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
    public static List<Integer> acmTeam(String topics[]){
        List<Integer> ans = new ArrayList<>();
        int maxTopic = 0;
        int team = 0;
        
        for(int i = 0; i < topics.length - 1; i++){
            for(int j = i + 1; j < topics.length; j++){
                int max = 0;
                for(int k = 0; k < topics[i].length(); k++){
                    if(topics[i].charAt(k) == '1' || topics[j].charAt(k) == '1'){
                        max++;
                    }
                    
                }
                if(max > maxTopic){
                    maxTopic = max;
                    team = 0;
                }
                if(maxTopic == max){
                    team++;
                }
            }
        }
        ans.add(maxTopic);
        ans.add(team);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String topics[] = new String[n];
        for(int i = 0; i < n; i++){
            topics[i] = sc.next();
        }
        List<Integer> ans = new ArrayList<>();
        ans = acmTeam(topics);
        
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
        
    }
}
