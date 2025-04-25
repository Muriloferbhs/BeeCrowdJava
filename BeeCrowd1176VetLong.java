package beecrowd;

import java.util.Scanner;

public class BeeCrowd1175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [] Fib = new long [100];
		Fib[0] = 0;
		Fib[1] = 1;
		for (int i = 2;i < 100; i++) {
			Fib[i] = Fib[i-1] + Fib[i-2];
		}
		int T = sc.nextInt();
		for(int j = 0; j < T; j++) {
			int N = sc.nextInt();
			System.out.printf("Fib(%d) = %d\n", N, Fib[N]);
		}
		sc.close();
	}
}
