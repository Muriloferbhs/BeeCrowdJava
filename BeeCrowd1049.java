package beecrowd;

import java.util.Scanner;

public class BeeCrowd1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String primeiro = sc.next();
		String segundo = sc.next();
		String terceiro = sc.next();
		String vertebrado = "vertebrado", ave = "ave", carnivoro = "carnivoro", onivoro = "onivoro", mamifero = "mamifero", herbivoro = "herbivoro", invertebrado = "invertebrado", inseto = "inseto", anelideo = "anelideo", hematofago = "hematofago";
		
		if (primeiro == vertebrado) {
		if (segundo == ave) {
				if (terceiro == carnivoro) {
					System.out.println("aguia");
				}
				if(terceiro == onivoro) {
					System.out.println("pomba");
				}
		}
			
			if(segundo == mamifero) {
				if(terceiro == onivoro) {
					System.out.println("homem");
				}
				if(terceiro == herbivoro) {
					System.out.println("vaca");
				}
			}
		}
		
		if (primeiro == invertebrado ) {
		if (segundo == inseto) {
				if (terceiro == hematofago) {
					System.out.println("pulga");
				}
				if(terceiro == herbivoro) {
					System.out.println("lagarta");
				}
		}
			
			if(segundo == anelideo) {
				if(terceiro == hematofago) {
					System.out.println("sanguessuga");
				}
				if(terceiro == onivoro) {
					System.out.println("minhoca");
				}
			}
		}
		sc.close();
	}

}