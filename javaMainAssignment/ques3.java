package javaMainAssignment;
import java.util.*;

public class ques3 {

    public static void main(String[] args){
        ArrayList <String> al = new ArrayList<String>();
        al.add("Python");
        al.add("Java");
        al.add("C++");
        al.add("Nodejs");
        al.add("Ruby");
        al.add("C");

        System.out.println("Advanced for loop");
        al.forEach((lang)->{
            System.out.println(lang);
        });

        System.out.println("\nWwhile loop");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nFor loop");
        for(String lang:al){
            System.out.println(lang);
        }

    }

}
