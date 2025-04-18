package beecrowd;

import java.util.Scanner;

public class BeeCrowd1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int um = sc.nextInt();
		int dois = sc.nextInt();
		int tres = sc.nextInt();
		int quatro = sc.nextInt();
		int cinco = sc.nextInt();
		
		int pares = 0;
		
		if(um % 2 == 0) {
			pares ++;
		}
		if(dois % 2 == 0) {
			pares ++;
		}
		if(tres % 2 == 0) {
			pares ++;
		}
		if(quatro % 2 == 0) {
			pares ++;
		}
		if(cinco % 2 == 0) {
			pares ++;
		}
		
		System.out.println(pares + " valores pares");
		sc.close();
	}
}
