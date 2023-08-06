package worksheet_set_2;

import java.util.Scanner;

public class LargestNumberOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the 1st  digit : ");
		int x = input.nextInt();
		System.out.print("Please Enter the 2nd  digit : ");
		int y = input.nextInt();
		System.out.print("Please Enter the 3rd  digit : ");
		int z = input.nextInt();
		if (x >= y && x >= z) {
			System.out.println(x + " is greater ");
		} else if (y >= x && y >= z) {
			System.out.println(y + " is greater ");

		} else if ((z >= x && z >= y)) {
			System.out.println(z + " is greater ");

		}
	}

}
