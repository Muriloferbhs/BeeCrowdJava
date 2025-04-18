package beecrowd;

import java.util.Scanner;

public class BeeCrowd1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi = sc.nextInt();
		int mi = sc.nextInt();
		int hf = sc.nextInt();
		int mf = sc.nextInt();
		int mt = 0, ht = 0;
		
		hi *= 60;
		hf *= 60;
		
		mi += hi;
		mf += hf;
		
		mt = mf - mi;
		
		if(mf - mi == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		 
		else if (mt < 0) {
			mt = mt + 1440;
			ht = mt / 60;
			mt = mt % 60;
			System.out.println("O JOGO DUROU " + ht + " HORA(S) E " + mt + " MINUTO(S)");
		}
		else {
			ht = mt / 60;
			mt = mt % 60;
	        System.out.println("O JOGO DUROU " + ht + " HORA(S) E " + mt + " MINUTO(S)");
        }
		sc.close();
	}
}
