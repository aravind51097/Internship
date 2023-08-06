package worksheet_set_2;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the length of rectangle : ");
		double lenght = input.nextDouble();
		System.out.print("Please Enter the width of rectangle : ");
		double width = input.nextDouble();

		double perimiter = 2 * (lenght + width);
		System.out.println("perimiter of rectangle : " + perimiter);

		double area = lenght * width;
		System.out.println("Area of the rectangle : " + area);

	}

}
