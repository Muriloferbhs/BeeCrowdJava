import java.util.Scanner;
import java.util.Locale;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
        double  [] A = new double [100];
        for(int i = 0; i < 100 ; i++){
            double x = sc.nextDouble();
            A[i] = x;
            
            if(x <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
        
        sc.close();
	}
}
