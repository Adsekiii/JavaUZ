import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try
        {
            File file = new File("logi.txt");

            if(file.createNewFile())
            {
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already Created");
            }

            for(int i = 0 ; i < 10 ; i++)
            {
                Random rand = new Random();
                int r = rand.nextInt(4)+1;
                Filmy filmy = new Filmy(file.getName(), i, i+20, r, new Date().toString());
                filmy.start();
            }

                Random rand = new Random();
                int r = rand.nextInt(4)+1;
                FilmyImplements filmy = new FilmyImplements(file.getName());
                Thread t = new Thread(filmy);
                t.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

//        Generator1020 gen1 = new Generator1020();
//        Generator2130 gen2 = new Generator2130();
//
//        gen1.setName("wątek 1");
//        gen2.setName("wątek 2");
//
//        gen1.start();
//        gen2.start();



//        List<Watek> watki = new ArrayList<Watek>();
//        String name;
//        int id;
//        for (int i = 0; i < 15; i++)
//        {
//            watki.add(new Watek());
//            watki.get(i).start();
//        }
//
//        System.out.println();
    }
}
