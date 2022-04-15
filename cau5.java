package date_18_3;

import java.util.Scanner;

public class cau5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Ithe string: "); 
		String str = input.nextLine();
		System.out.println("The string is: " + str);
		int[] arr = new int[130];
		for (int i = 0; i < str.length(); i++)
			arr[ (int) str.charAt(i)] ++;
		for (int i = 0; i < 130; i++) if (arr[i] > 0)
			System.out.println((char) i + ": " + arr[i]);
		input.close();

	}

}
