package worksheet_set_2;

import java.util.Scanner;

public class AverageOfTwoNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the 1st  digit : ");
		int x = input.nextInt();
		System.out.print("Please Enter the 2nd  digit : ");
		int y = input.nextInt();
		System.out.println("The average of  " + x + "," + y + " is " + (double) (x + y) / 2);
	}

}
