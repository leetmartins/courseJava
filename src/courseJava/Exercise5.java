package courseJava;
import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod_1, cod_2, qte_1, qte_2;
	    double preco_1, preco_2, total;

	    cod_1 = sc.nextInt();
	    qte_1 = sc.nextInt();
	    preco_1 = sc.nextDouble();
	    
	    cod_2 = sc.nextInt();
	    qte_2 = sc.nextInt();
	    preco_2 = sc.nextDouble();

	    total = (preco_1 * qte_1) + (qte_2*preco_2) ;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	
	}
}
