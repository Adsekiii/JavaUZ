import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(51) + 99;
        }

        int[] newArr = new int[arr.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        quicksort(arr,0,arr.length-1,0);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void quicksort(int[] arr, int begin, int end, int razy){
        if(begin < end && razy < 2){
            int newPivot = newIndex(arr, begin, end);

            quicksort(arr, begin, newPivot-1,razy+1);
            quicksort(arr, newPivot + 1, end,razy+1);
        }
    }

    public static int newIndex(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i = begin-1;

        for(int j = begin; j < end; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
}
