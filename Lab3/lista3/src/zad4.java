import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba = 1;
        int inputInt = sc.nextInt();
        while(inputInt != 5){
            liczba *= inputInt;
            inputInt = sc.nextInt();
        }
        System.out.println(liczba);
        sc.close();
    }
}
