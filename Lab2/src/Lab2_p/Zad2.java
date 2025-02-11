package Lab2_p;

import java.util.Scanner;

public class Zad2 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Podaj a: ");
	int a = scanner.nextInt();
	System.out.print("Podaj b: ");
	int b = scanner.nextInt();
	System.out.print("Podaj c: ");
	int c = scanner.nextInt();
	double delta = (Math.pow(b,2)) - (4*a*c);
	System.out.println("delta = " + delta);
	if (delta < 0) {
	  System.out.println("Rowiązanie nie istnieje");
	}else if (delta == 0) {
	  double x = -b/(2*a);
	  System.out.println("x = " + x);
	}else {
	  double x1 = (-b - Math.sqrt(delta))/(2*a);
	  double x2 = (-b + Math.sqrt(delta))/(2*a);
	  System.out.println("x1 = " + x1);
	  System.out.println("x2 = " + x2);
	}
	scanner.close();
  }
}
