import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
        int X = 3;
        while (X !=0){
            for(int i = 1; i <= X; i++){
                System.out.printf("%d ", i);
            }
            System.out.println();
            X = sc.nextInt();
        }
	    sc.close();
	}
}
