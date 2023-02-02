package courseJava;

import java.util.Locale;

public class ExtraExercise {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'M';
		
		double price = 2100.0;
		double price2 = 650.50;
		double mesure = 53.234567;
		
		
		System.out.printf("Products:\n%s,which price is $ %.2f\n%s, which price is $ %.2f\n\n",product1, price, product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender %c\n\n", age, code, gender);
		
		System.out.printf("Mesure with eight decimal places: %.8f\nRouded(three decimal places): %.3f\n",mesure, mesure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n",mesure);
		
		
	}

}
