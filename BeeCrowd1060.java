package beecrowd;

import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1060 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int pos = 0;
		
		for(cont = 0; cont < 6; cont ++) {
			double num = sc.nextDouble();
			if(num > 0) {
				pos++;
			}
		}
		System.out.println(pos + " valores positivos");
		sc.close();
	}
}