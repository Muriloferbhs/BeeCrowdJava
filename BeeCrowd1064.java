package beecrowd;

import java.util.Scanner;
import java.util.Locale;

public class BeeCrowd1064 {
	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		double pos = 0;
		double media = 0;

				
		
		for(cont = 0; cont < 6; cont ++) {
			double num = sc.nextDouble();
			
			if(num > 0) {
					pos++;
					media = media + num;
					
			}
		}
		media = media / pos;
		System.out.println(String.format("%.0f", pos)+ " valores positivos");
		System.out.println(String.format("%.1f", media));
		sc.close();
	 
	 
	}
}

