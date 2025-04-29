import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int N = sc.nextInt();
	    int[] X = new int [N];
	    int valor = 0;
	    
	    for(int i = 0; i < N; i ++){
	        valor = sc.nextInt();
            X[i] = valor;
	    }
	    
	    int menor = X[0];
	    for(int j = 0; j < N; j ++){
	        if(menor > X[j]){
	            menor = X[j];
	        }
	    }
	    System.out.println("Menor Valor: "+ menor);
	    
	    int m=0;
	    while (menor != X[m]){
	        m++;
	    }
	    
	    System.out.println("Posicao: " + m);
	}
}
