package beecrowd;

import java.util.Scanner;

public class BeeCrowd1101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M;
		int N;
		do {
			M = sc.nextInt();
			N = sc.nextInt();
			int sum = 0;
			int i = 0;
			
			if (M > 0 && N > 0 && N > M) {
				for (i = M; i <= N; i++) {

					System.out.print(i + " ");
					sum = sum + i;

				}

				if (sum != 0) {
					System.out.println("Sum=" + sum);
				}
			}
			
			if (M > 0 && N > 0 && M > N) {
				for (i = N; i <= M; i++) {

					System.out.print(i + " ");
					sum = sum + i;

				}

				if (sum != 0) {
					System.out.println("Sum=" + sum);
				}
			}
		} while (M != 0 && N != 0);

		sc.close();
	}
}