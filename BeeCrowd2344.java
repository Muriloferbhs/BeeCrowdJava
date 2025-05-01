import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = sc.nextInt();
		
		if (nota == 0) {
			System.out.println("E");
		}
		if (1 <= nota && nota <= 35) {
			System.out.println("D");
		}
		if (36 <= nota && nota <= 60) {
			System.out.println("C");
		}
		if (61 <= nota && nota <= 85) {
			System.out.println("B");
		}
		if (86 <= nota && nota <= 100) {
			System.out.println("A");
		}
		
		sc.close();
	}
}
