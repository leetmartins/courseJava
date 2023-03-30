package courseJava;
import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		int A, B;
		double total=0;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		
		switch(A){
			case 1:
				total = 4 * B;
				 break;
			case 2:
				total = 4.5 * B;
				 break;
			case 3:
				total = 5 * B;
				 break;
			case 4:
				total = 2 * B;
				 break;
			case 5:
				total = 1.5 * B;
				 break;
			
		}
		
		Locale.setDefault(Locale.US);
		System.out.printf("Total: R$ %.2f\n",total);
		
		sc.close();
	}
}
