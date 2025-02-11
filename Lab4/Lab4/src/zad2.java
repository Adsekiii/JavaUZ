import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] tab = new int[7][7];
        float srednia = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(100) + 1;
                srednia += tab[i][j];
            }
        }

        int[] colMax = new int[]{tab[0][0],tab[0][1],tab[0][2],tab[0][3],tab[0][4],tab[0][5],tab[0][6]};
        int[] colMin = new int[]{tab[0][0],tab[0][1],tab[0][2],tab[0][3],tab[0][4],tab[0][5],tab[0][6]};
        int liczbaMniejszych = 0;
        int liczbaWiekszych = 0;

        int Max = tab[0][0];
        int Min = tab[0][0];

        srednia /= (tab.length * tab[0].length);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[j][i] > colMax[i]) {
                    colMax[i] = tab[j][i];
                }
                if (tab[j][i] < colMin[i]) {
                    colMin[i] = tab[j][i];
                }
                if(tab[i][j] < srednia){
                    liczbaMniejszych++;
                } else if(tab[i][j] > srednia){
                    liczbaWiekszych++;
                }

                if(Max < tab[i][j]){
                    Max = tab[i][j];
                }else if(Min > tab[i][j]){
                    Min = tab[i][j];
                }

            }
        }

        for (int i = 0; i < colMax.length; i++) {
            System.out.println(i+1 + " kolumna Max: " + colMax[i]);
            System.out.println(i+1 + " kolumna Min: " + colMin[i]);
        }

        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);
        System.out.println("Średnia: " + srednia);
        System.out.println("Liczb mniejszych od średniej: " + liczbaMniejszych);
        System.out.println("Liczb większych od średniej: " + liczbaWiekszych);

        int[][] newTab = new int[7][7];


        for (int i = tab.length-1; i >= 0 ; i--) { //i = 6
            for (int j = tab[0].length-1; j >= 0; j--) { // j = 6
                newTab[i][j] = tab[tab.length-i-1][tab[0].length-j-1]; // 7
            }
        }


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(newTab[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
        }
    }
}
