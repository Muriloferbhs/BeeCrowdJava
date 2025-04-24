package beecrowd;

import java.util.Scanner;

public class BeeCrowd1175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] M = new int [20];
		int [] N = new int [20];
		int valor;
		for(int i = 0; i < 20; i++) {
			valor = sc.nextInt();
			M[i] = valor;
		}
		N[0] = M[19];
		System.out.println("N[0] = " + N[0]);
		N[1] = M[18];
		System.out.println("N[1] = " + N[1]);
		N[2] = M[17];
		System.out.println("N[2] = " + N[2]);
		N[3] = M[16];
		System.out.println("N[3] = " + N[3]);
		N[4] = M[15];
		System.out.println("N[4] = " + N[4]);
		N[5] = M[14];
		System.out.println("N[5] = " + N[5]);
		N[6] = M[13];
		System.out.println("N[6] = " + N[6]);
		N[7] = M[12];
		System.out.println("N[7] = " + N[7]);
		N[8] = M[11];
		System.out.println("N[8] = " + N[8]);
		N[9] = M[10];
		System.out.println("N[9] = " + N[9]);
		N[10] = M[9];
		System.out.println("N[10] = " + N[10]);
		N[11] = M[8];
		System.out.println("N[11] = " + N[11]);
		N[12] = M[7];
		System.out.println("N[12] = " + N[12]);
		N[13] = M[6];
		System.out.println("N[13] = " + N[13]);
		N[14] = M[5];
		System.out.println("N[14]= " + N[14]);
		N[15] = M[4];
		System.out.println("N[15] = " + N[15]);
		N[16] = M[3];
		System.out.println("N[16] = " + N[16]);
		N[17] = M[2];
		System.out.println("N[17] = " + N[17]);
		N[18] = M[1];
		System.out.println("N[18] = " + N[18]);
		N[19] = M[0];
		System.out.println("N[19] = " + N[19]);
		sc.close();
	}

}
