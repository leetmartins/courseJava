package courseJava;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		int init, fim, time;
		Scanner sc = new Scanner(System.in);

		init = sc.nextInt();
		fim = sc.nextInt();		
		
		if (fim > init) {
			time = fim - init;
		}
		else {
			time = 24 - init + fim;
		}
		
		System.out.println("O JOGO DUROU " + time + " HORA(S)");
		
		sc.close();
	}
}
