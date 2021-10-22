package Day2;



import java.util.*;
public class Assignment1 {
	
		public static void main(String[] args)
		{
		
		 List<String> words = Arrays.asList( "bbbbb", "zzzzzz","ccccccccccc", "AAA", "kkkkkkkkkkkkkkk"); 
		
		 Optional<String> longestString = words.stream().reduce((word1, word2) -> {
			return word1.length() < word2.length() ? word2 : word1;
		
		 		}
				 ); 
		 	
		 	System.out.println("Length:"+longestString.get().length());
		
		 	System.out.print("String:");
		 	longestString.ifPresent(System.out::println);
		 	String str = longestString.get();
			}
}

