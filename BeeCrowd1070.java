import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int cont = 0;
		if(X % 2 == 0){
		    X = X + 1;
		}
		System.out.println(X);
		
		for (cont = 0; cont < 5; cont ++){
		    X = X + 2;
		    System.out.println(X);
		}
		sc.close();
	}
}
