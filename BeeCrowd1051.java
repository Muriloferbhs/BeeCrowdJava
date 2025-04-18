package beecrowd;

import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1051 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		double imp = 0;
		
		if(renda <= 2000.00) {
			System.out.println("Isento");
		}
		else {
			if(2000.00 < renda && renda <= 3000.00) {
				imp = renda - 2000.00;
				imp = 0.08 * imp;
			}
			if(3000 < renda && renda <= 4500) {
				renda -= 2000;
				renda -= 1000;
				imp = 1000 * 0.08 + renda * 0.18;
			}
			if(4500 < renda) {
				renda -= 2000;
				renda -= 1000;
				renda -= 1500;
			
				imp = 1000 * 0.08 + 1500 * 0.18 + renda * 0.28;
			}
			System.out.println("R$ " + String.format("%.2f", imp));
		}
		sc.close();
	}
}