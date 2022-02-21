package javaMainAssignment;

import java.util.ArrayList;
import java.util.List;

public class ques7 {
	final static int MAX_CHAR = 256;

	static void findFirstNonRepeating()
	{
		List<Character> inDLL = new ArrayList<Character>();

		boolean[] repeated = new boolean[MAX_CHAR];

		String stream = "mynameisnjayeshsingh";
		for (int i = 0; i < stream.length(); i++) {
			char x = stream.charAt(i);
			if (!repeated[x]) {
				if (!(inDLL.contains(x))) {
					inDLL.add(x);
				}
				else 
				{
					inDLL.remove((Character)x);
					repeated[x]
						= true;
				}
			} 
			if (inDLL.size() != 0 && i==stream.length()-1) {
				System.out.println("First non-repeating character is "+inDLL.get(0));
			}
		}
	}
	public static void main(String[] args)
	{
		findFirstNonRepeating();
	}
}

