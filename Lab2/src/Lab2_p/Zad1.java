package Lab2_p;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("podaj wielkość: ");
		int wielkosc = scanner.nextInt();
		for(int i = 0; i<=wielkosc; i++) {
			
			for(int k = wielkosc-i; k>0; k--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j<=2*i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		for(int k = wielkosc; k>0; k--) {
			System.out.print(" ");
		}
		System.out.print("#");
		scanner.close();
	}
}
