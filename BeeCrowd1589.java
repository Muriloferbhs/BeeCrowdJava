import java.util.Scanner

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		int N = nextInt();
		
		for(int i = 0; i < N; i++){
		    int C = nextInt();
		    int c = nextInt();
		    
		    C += c;
		    System.out.println(C);
		}
		sc.close();
	}
}
