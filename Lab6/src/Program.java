import java.util.Scanner;

public class Program
{
    int temperatura,czasPraniaWstepnego,czasPraniaZasadniczego,predkoscWirowania;
    boolean dodatkowePlukanie;

    public void inicjalizuj(int temperatura, int czasPraniaWstepnego, int czasPraniaZasadniczego, boolean dodatkowePlukanie, int predkoscWirowania)
    {
        this.temperatura = temperatura;
        this.czasPraniaWstepnego = czasPraniaWstepnego;
        this.czasPraniaZasadniczego = czasPraniaZasadniczego;
        this.dodatkowePlukanie = dodatkowePlukanie;
        this.predkoscWirowania = predkoscWirowania;
    }

    public Program()
    {
        System.out.println("Wybierz program");
        System.out.println("1.bawełna");
        System.out.println("2.bielizna");
        System.out.println("3.własny");

        Scanner sc = new Scanner(System.in);
        switch(sc.nextInt())
        {
            case 1:
                inicjalizuj(50,50,50,true,1000);
                break;
            case 2:
                inicjalizuj(60,70,90,false,1200);

                break;
            case 3:
                System.out.println("temperatura:");
                int temperatura = sc.nextInt();

                System.out.println("czas prania wstępnego:");
                int czasPraniaWstepnego = sc.nextInt();

                System.out.println("czas prania zasadniczego:");
                int czasPraniaZasadniczego = sc.nextInt();

                System.out.println("dodatkowe płukanie (true/false):");
                boolean dodatkowePlukanie = sc.nextBoolean();

                System.out.println("prędkość wirowania:");
                int predkoscWirowania = sc.nextInt();

                inicjalizuj(temperatura, czasPraniaWstepnego, czasPraniaZasadniczego, dodatkowePlukanie, predkoscWirowania);


                break;
        }
    }

}
