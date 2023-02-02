package courseJava;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A,B,C;
		double tri,circ,trap,quad,ret,pi = 3.14159;

	    A = sc.nextFloat();
	    B = sc.nextFloat();
	    C = sc.nextFloat();
	    
	    tri = (A * C)/2.0;
	    circ = pi * Math.pow(C, 2.00);
	    trap = (A + B)/2.0 * C;
	    quad = Math.pow(B, 2.00);
	    ret = A * B;
	    
	    System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
	    
	   
		sc.close();
	
	}
}
