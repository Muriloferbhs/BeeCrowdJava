import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = 0;
        int r = 0;
        if(a > b){
            q = a / b;
            r = a % b;
        }
        
        if(a < b){
            int cont = b - a;
            
            q = cont / b;
            r = cont % b;
            
            if (a < 0 && b > 0){
                q = q * -1;
            }
            
        }
        System.out.println(q + " " + r);
        

        sc.close();
	}
}
