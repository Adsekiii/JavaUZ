package Lab2_p;

import java.util.Scanner;

public class Zad5 {
	
	public static double add(double a, double b) {	
		return a+b;
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static double mul(double a, double b) {
		return a*b;
	}
	public static double div(double a, double b) {
		return a/b;
	}
	public static double pow(double a, double b) {
		return Math.pow(a, b);
	}
	
	public static void main(String[] args) {
		float a = 2;
		float b = 2;
		char operacja;
		
		
		
		while(true) {
			Scanner wejscie = new Scanner(System.in);
			System.out.println("wybierz liczbę a:");
			a = wejscie.nextFloat();
			System.out.println("wybierz liczbę b:");
			b = wejscie.nextFloat();
			System.out.println("wybierz operację::");
			operacja = wejscie.next().charAt(0);
			switch(operacja) {
			case '+':
				System.out.println("wynik to :" + add(a,b));
				break;
			case '-':
				System.out.println("wynik to :" + sub(a,b));
				break;
			case '*':
				System.out.println("wynik to :" + mul(a,b));
				break;
			case '/':
				if(b == 0) {
					System.out.println("Nie dzielimy przez 0, wybierz ponownie!");
				}else {
					System.out.println("wynik to :" + div(a,b));	
				}
				break;
			case '^':
				System.out.println("wynik to :" + pow(a,b));
				break;
			default:
				System.out.println("niepoprawny operator, wybierz ponownie!");
				break;
				
			}
			wejscie.close();
		}
		
		
	}
	
	
}
