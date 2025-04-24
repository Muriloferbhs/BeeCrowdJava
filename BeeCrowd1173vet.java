import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
	Scanner sc = new Scanner (System.in);
        int [] X = new int [10];
        int x = sc.nextInt();
        for(int i = 0; i < 10 ; i++){
            X[i] = x;
            System.out.println("N[" + i + "] = " + x);
            x = x * 2;
        }     
        sc.close();
    }
}
