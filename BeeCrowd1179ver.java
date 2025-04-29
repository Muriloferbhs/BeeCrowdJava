package beecrowd;

import java.util.Scanner;

public class BeeCrowd1179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] par = new int[5];
		int[] impar = new int[5];
		int num;
		int ps = 0;
		int imps = 0;

		for (int i = 0; i < 15; i++) {
			num = sc.nextInt();

			if (num % 2 == 1 || num % 2 == -1) {
				impar[imps] = num;
				imps++;
				if (imps == 5) {
					for (int p = 0; p < imps; p++) {
						System.out.println("impar[" + p + "] = " + impar[p]);
						impar[p] = 0;
					}
					imps = 0;
				}
			}

			if (num % 2 == 0) {
				par[ps] = num;
				ps++;
				if (ps == 5) {
					for (int j = 0; j < ps; j++) {
						System.out.println("par[" + j + "] = " + par[j]);

						par[j] = 0;
					}
					ps = 0;
				}
			}
		}
		for (int m = 0; m < imps; m++) {
			System.out.printf("impar[%d] = %d\n", m, impar[m]);
		}
		for (int n = 0; n < ps; n++) {
			System.out.printf("par[%d] = %d\n", n, par[n]);
		}

		sc.close();
	}

}
