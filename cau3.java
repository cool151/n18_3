package date_18_3;

import java.util.Scanner;

public class cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		System.out.print("Enter the number of characters: "); 
		int n = input.nextInt ();
		char[] arrChar = new char[n];
		for (int i = 0; i < arrChar.length; i++) {
			arrChar[i] = input.next().charAt(0);
		}
		String str = arrChar.toString();
		input.close();

	}

}
