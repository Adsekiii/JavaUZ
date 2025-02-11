import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zad1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(51) + 99;
        }

        int[] newArr = new int[arr.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.println(newArr[i]);
        }

    }
}