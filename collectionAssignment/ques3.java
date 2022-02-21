package collectionAssignment;
import java.util.*;

public class ques3 {

    public static void TrimList( List<String> strs ){
        ListIterator <String> i = strs.listIterator();
        while(i.hasNext()){
            i.set(i.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("     hello ","         world");
        TrimList(list);
        for (String s : list) {
            System.out.format("\"%s\"%n", s);
        }
    }
}
