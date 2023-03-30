package courseJava;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();
	    
	   if(number < 0) {
		   System.out.println("NEGATIVO");
	   }
	   else {
		   System.out.println("NAO NEGATIVO");
	   }   	    
	   
	   sc.close();
	
	}
}
