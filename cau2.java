package date_18_3;

import java.util.Scanner;

public class cau2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner (System.in);
			System.out.print("Enter the string: "); String str = input.nextLine();
			String words[]=str.split("\\s");
	        String capitalizeStr="";
	        for(String word:words){
	            String firstLetter=word.substring(0,1);
	            String remainingLetters=word.substring(1);
	            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
	        }
	        System.out.println(capitalizeStr);
			

	}

}
