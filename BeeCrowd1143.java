import java.util.Scanner;
public class Main
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		a = a * 300;
		b = b * 1500;
		c = c * 600;
		d = d * 1000;
		e = e * 150;
		
		a = a + b + c + d + e + 225;
		
		System.out.println(a);
		sc.close();
	}
}
