package stringTokenizer;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		String str1 = "Today's weather is cold, and it is snowing alot.";
		String str2 = "2014/12/25";
		
		System.out.println(str1);
		System.out.println(str2);
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");
		
		System.out.println("tokenizer1 # of words: " + tokenizer1.countTokens());
		System.out.println("tokenizer2 # of words: " + tokenizer2.countTokens());
		
		while (tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
		
		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
				
	}
}
