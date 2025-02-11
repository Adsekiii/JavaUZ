import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while (liczba < 0) {
            System.out.println("Wpisz liczbę większą od 0!");
            liczba = sc.nextInt();
        }

        for(int i = 0 ; liczba >= Math.pow(3,i) ; i++){
            System.out.println(Math.pow(3,i));
        }

        sc.close();
    }
}
