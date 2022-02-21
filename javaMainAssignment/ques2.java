package javaMainAssignment;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map <String, Integer> map = new HashMap<>();
        System.out.println("Enter a string");
        String str = sc.nextLine(); 
        
        String [] words = str.split(" ");
        for(String word:words){
            word = word.toLowerCase();
            Integer count = map.get(word);
            if(count == null){
                map.put(word, 1);
            }
            else{
                map.put(word,count+1);
            }
        }
        System.out.println(map);
    }
}
