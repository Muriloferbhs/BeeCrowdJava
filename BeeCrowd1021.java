package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        N = 100 * N;
        N = (int)(N);
		int n50, n20, n10, n5, n2, n100 = 0;
		int m100, m50, m25, m10, m5, m1;
		
		System.out.println("NOTAS:");
		
		n100 = (int) (N/10000);
		System.out.println(n100 + " nota(s) de R$ 100.00");
    	N = N % 10000;

		n50 = (int) (N / 5000);
		System.out.println(n50 + " nota(s) de R$ 50.00");
        N = N % 5000;
		
		n20 = (int) (N / 2000);
		System.out.println(n20 + " nota(s) de R$ 20.00");
		N = N % 2000;
		
		n10 = (int) (N /1000);
        System.out.println(n10 + " nota(s) de R$ 10.00");       
		N = N % 1000;
		
		n5 = (int) (N / 500);
        System.out.println(n5 + " nota(s) de R$ 5.00");
		N = N % 500;
		
		n2 = (int) (N / 200);
        System.out.println(n2 + " nota(s) de R$ 2.00");
		N = N % 200;
		
		System.out.println("MOEDAS:");
		
		m100 = (int) (N / 100);
        System.out.println(m100 + " moeda(s) de R$ 1.00");
        N = N % 100;
        
		m50 = (int) (N / 50);
        System.out.println(m50 + " moeda(s) de R$ 0.50");
		N = N % 50;

		m25 = (int) (N / 25);
        System.out.println(m25 + " moeda(s) de R$ 0.25");
		N = N % 25;

		m10 = (int) (N / 10);
        System.out.println(m10 + " moeda(s) de R$ 0.10");
		N = N % 10;

		m5 = (int) (N / 05);
        System.out.println(m5 + " moeda(s) de R$ 0.05");
		N = N % 05;

		m1 = (int) (N / 01);
        System.out.println(m1 + " moeda(s) de R$ 0.01");
        sc.close();	
	}

}
