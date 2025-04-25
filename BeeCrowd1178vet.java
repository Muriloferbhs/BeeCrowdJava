package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1178 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double [] N = new double [100];
		N[0] = X;
		System.out.println("N[0] = " + String.format("%.4f",X));
		for(int i = 1; i < 99; i++) {
			N[i] = N[i-1] / 2;
			System.out.println("N[" + i + "] = " + String.format("%.4f",N[i]));
		}
		
		
		sc.close();
	}
}
