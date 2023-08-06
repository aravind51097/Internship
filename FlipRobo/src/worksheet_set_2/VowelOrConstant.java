package worksheet_set_2;

import java.util.Scanner;

public class VowelOrConstant {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please Enter the Charecter : ");
		char alpha=input.next().toLowerCase().charAt(0);
		
		if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' ) {
			System.out.println(alpha +"  is Vowel : ");
		}else {
			System.out.println(alpha +" Not a vowel ");
		}
	
	}

}
