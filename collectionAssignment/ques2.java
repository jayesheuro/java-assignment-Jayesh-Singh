package collectionAssignment;

import java.util.*;

public class ques2 {
    static final Comparator<String> cmp = new Comparator<String>() {
        public int compare(String str1, String str2){
            return str1.compareTo(str2);
        }
    };

    public static void main(String[] args){
        SortedSet<String> s = new TreeSet<String>(cmp);
        String arr[] = {"python","go","python","javascript","java"};
        for(String str : arr){
            s.add(str);
        }
        System.out.println(s.size() + " Distinct: " + s);
    }

}
