package worksheet_set_2;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter the Principle  amount : ");
		double total_principle_amount=input.nextDouble();
		System.out.print("Please Enter the anual intrest  rate : ");
		double intrest_per_year=input.nextDouble();
		System.out.print("Please Enter the year of tenure  : ");
		double no_of_years=input.nextDouble();
		
		double simple_intrest=(total_principle_amount*(intrest_per_year*no_of_years))/100;
		
		System.out.println("simple interst: "+simple_intrest);
				
		
	}

}
