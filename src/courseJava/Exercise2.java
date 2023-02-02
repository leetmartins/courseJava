package courseJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		double r,pi=3.14159,area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextDouble();
		area = pi*Math.pow(r, 2.00);
		
		
		System.out.printf("A = %.4f\n",area);
		
		sc.close();
	
	}
}
