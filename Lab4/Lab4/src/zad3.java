import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            if(i >= 31){
                arr[i] = rand.nextInt(15)+60;
            } else if (i >= 21) {
                arr[i] = rand.nextInt(44)+11;
            } else if (i >= 11) {
                arr[i] = rand.nextInt(4)+6;
            } else if (i >= 0) {
                arr[i] = rand.nextInt(4)+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
