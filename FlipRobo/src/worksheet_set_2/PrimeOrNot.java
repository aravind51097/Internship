package worksheet_set_2;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Pleae Enter thr Number : ");
		int num=input.nextInt();
		int temp=0;
		System.out.println(6%2);
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp++;
				break;
			}
		}if(temp>=1) {
			System.out.println("Given num is not a Prime number ");
			
		}else {
			System.out.println("Given num is  Prime number ");
			
		}
	}
}
