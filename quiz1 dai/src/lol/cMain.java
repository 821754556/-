package lol;

import java.util.Scanner;

public class cMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of passing attempts: ");
		double ATT = input.nextDouble();
		System.out.print("Number of completions: ");
		double COMP = input.nextDouble();
		System.out.print("Passing yards: ");
		double YDS = input.nextDouble();
		System.out.print("Touchdown passes: ");
		double TD = input.nextDouble();
		System.out.print("Interceptions: ");
		double INT = input.nextDouble();
		
		double d = (COMP / ATT - 0.3) * 5;
		if (d > 2.375)
			d = 2.375;
		else if (d < 0)
			d = 0;
		double c = (YDS / ATT - 3) * 0.25;
		if (c > 2.375)
			c = 2.375;
		else if (c < 0)
			c = 0;
		double b = (TD / ATT) * 20;
		if (b > 2.375)
			b = 2.375;
		else if (b < 0)
			b = 0;
		double a = 2.375 - (INT / ATT * 25);
		if (a > 2.375)
			a = 2.375;
		else if (a < 0)
			a = 0;
		
		double QBrating = (a + b + c + d) / 6 * 100;
		
		System.out.print("The QB rating is: " + QBrating);
	}
}
