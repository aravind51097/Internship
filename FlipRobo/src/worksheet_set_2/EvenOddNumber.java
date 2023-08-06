package worksheet_set_2;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter the number : ");
		int x=input.nextInt();
		if(x%2==0) {
			System.out.println("The " +x +" is Even ");
		}else {
			System.out.println("The " +x +" is ODD ");
			
		}
	}
}
