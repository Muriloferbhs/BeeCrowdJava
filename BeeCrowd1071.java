import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int x = 0, y = 0;
		int soma = 0;
		if(X != Y){
		    if(X > Y){
		        X = x;
		        y = Y + 1;
		    }
	    	if (X < Y){
                Y = x;
                y = X + 1;
		    }
		    
		    for(int i = y; i < x; i++){
		        if (1 == i % 2 || -1 == i % 2){
		            soma += i;
		        }
		    }
		    System.out.println(soma);
		}
		else {
		    System.out.println("0");
		}
	}
}
