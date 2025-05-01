import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0;
		int D = 0;
		
		
		while (i < N) {
			int T = sc.nextInt();
			int V = sc.nextInt();
			
			int d = T * V;
			
			D = D + d;	
		}
		System.out.println(D);
	}
}
