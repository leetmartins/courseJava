package courseJava;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String main[]) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		while(x!=0 && y!=0) {
			if(x>0 && y>0) {
				System.out.println("primeiro");
			} else if (x<0 && y>0) {
				System.out.println("segundo");
			} else if (x<0 && y<0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x= sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
