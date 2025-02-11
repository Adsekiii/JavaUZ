package Lab2_p;

import java.lang.Math;
import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		int wklad = 0;
		int liczbaRat = 0;
		Scanner wejscie = new Scanner(System.in);
		System.out.println("podaj wkład własny: ");
		wklad = wejscie.nextInt();
		System.out.println("podaj liczbę rat: ");
		liczbaRat = wejscie.nextInt();
		
		
		double kwotaDoSplaty = 300000-wklad;
		if(wklad > 300000) {
			System.out.println("wkład własny przeracza dozwoloną ilość");
		}else {
			if(liczbaRat > 0 && liczbaRat <= 24) {
				kwotaDoSplaty = (Math.ceil(kwotaDoSplaty * 1.02*100/liczbaRat))/100;
			}else if(liczbaRat > 24 && liczbaRat <= 48) {
				kwotaDoSplaty = (Math.ceil(kwotaDoSplaty * 1.03*100/liczbaRat))/100;
			}else if(liczbaRat > 48 && liczbaRat <= 60) {
				kwotaDoSplaty = (Math.ceil(kwotaDoSplaty * 1.04*100/liczbaRat))/100;
			}else if(liczbaRat > 60 && liczbaRat <= 72) {
				kwotaDoSplaty = (Math.ceil(kwotaDoSplaty * 1.05*100/liczbaRat))/100;
			}else if(liczbaRat > 72 && liczbaRat <= 96) {
				kwotaDoSplaty = (Math.ceil(kwotaDoSplaty * 1.06*100/liczbaRat))/100;
			}
		}
		System.out.println("rata wynosi: " + kwotaDoSplaty);
		wejscie.close();
	}
	
}
