public class zad2 {
    public static void main(String[] args) {
        int liczba = 1234;

        for(int i = 1; i<= liczba/2; i++){
            if(liczba%i == 0){
                System.out.println(i);
            }
        }
    }
}
