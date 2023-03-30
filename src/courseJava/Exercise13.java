package courseJava;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String main[]) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			}
			else if (tipo == 2) {
				gasolina++;
			}
			else if (tipo == 3) {
				diesel++;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
