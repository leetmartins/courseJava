package courseJava;
import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
	        
	   	sc.close();
	
	}
}
