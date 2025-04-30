import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        M -= N;
        
        System.out.println(M);
		
		sc.close();
	}
}
