package worksheet_set_2;

import java.util.Scanner;

public class TableOfN {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.print("Please Enter the Number : ");
	int num=input.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num + " * "+ i + " = "+ num*i);
	}
}
}
