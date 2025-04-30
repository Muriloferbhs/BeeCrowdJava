import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		
		int cont = 0;
		
		if(A == T){
		    cont ++;
		} 
		if(B == T){
		    cont ++;
		} 
		if(C == T){
		    cont ++;
		} 
		if(D == T){
		    cont ++;
		} 
		if(E == T){
		    cont ++;
		} 
		
		System.out.println(cont);
		
		sc.close();
	}
}
