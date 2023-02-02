package courseJava;
import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		int number;
		double value,hour,salary;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		hour = sc.nextDouble();
		value = sc.nextDouble();
		
		salary = hour * value;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n",salary);
		
		sc.close();
	
	}
}
