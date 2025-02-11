
import java.util.ArrayList;
import java.util.Scanner;


public class zad1 {
    public static void main(String[] args) {
        ArrayList<Integer> parzyste = new ArrayList<Integer>();
        ArrayList<Integer> nieparzyste = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        String liczba = in.nextLine();;

        for(int i = 0; i< liczba.length(); i++){
            int x = Integer.parseInt(String.valueOf(liczba.charAt(i)));
            if(x%2==0){
                parzyste.add(x);
            } else {
                nieparzyste.add(x);
            }
        }

        System.out.println(parzyste.size() + ":" + nieparzyste.size());

        int liczbaInt = Integer.parseInt(liczba);

        if(prime(liczbaInt) == true){
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }

        in.close();
    }

    public static Boolean prime(int n){
        if(n <= 1){return false;}
        for(int i = 2; i <= n/2; i++){
            if(n%i==0){return false;}
        }
        return true;
    }
}