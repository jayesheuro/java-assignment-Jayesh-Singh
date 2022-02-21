package javaMainAssignment;
import java.util.*;

public class ques1 {
    public static void main(String[] args){
        Map<Integer, String> brands = new HashMap<Integer, String>();
        brands.put(1, "Nokia");
        brands.put(2, "Samsung");
        brands.put(3, "Xaiomi");
        brands.put(4, "Realme");

        System.out.println("Advanced forEach loop");
        brands.forEach((key, value)->{
            System.out.println(key + ", "+ value);
        });

        System.out.println("\nWhile loop");
        Iterator <Integer> itr = brands.keySet().iterator();        
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println(key + ", "+ brands.get(key));

        }
    }
}
