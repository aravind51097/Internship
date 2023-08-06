package worksheet_set_2;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the 1st  digit : ");
		int x = input.nextInt();
		System.out.print("Please Enter the 2nd  digit : ");
		int y = input.nextInt();
		int temp = x;
		x = y;
		y = temp;
		System.out.println(x + " , " + y);
	}
}
