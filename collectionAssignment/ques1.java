package collectionAssignment;
import java.util.*;
/**
 * @author jayesh singh
 *
 */
public class ques1 {

	public static void main(String[] args) {
        List<Integer> argList = Arrays.asList(45,234,456,23,45,47);

        Collections.shuffle(argList);
        
        System.out.println("printing by using traditional for");
        for(int num : argList){
            System.out.print(num+" ");
        }
        
        System.out.println("\nprinting by using streams");
        argList.stream().forEach(num->{
            System.out.print(num + " ");
        });
     }
}
