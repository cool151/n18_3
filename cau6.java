package date_18_3;

import java.util.Scanner;

public class cau6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: "); 
		String str = input.nextLine();
		
		System.out.print("Enter the word: "); 
		String word = input.next();
		int count = 0; 
		int i = 0;
		while (true) { 
			if (str.indexOf(word, i) == -1)
				break; 
			count++; 
			System.out.println (word + " at index " + str.indexOf(word));
			i = str.indexOf(word, i) + word.length();
		}
		
		if (count == 0) System.out.println("Not found " + word + " in "+ str);
		input.close();

	}

}
