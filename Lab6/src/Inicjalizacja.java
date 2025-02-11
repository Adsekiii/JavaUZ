public class Inicjalizacja {
    String nazwaKomponantu;
    public Inicjalizacja(String nazwa)
    {
        nazwaKomponantu = nazwa;
    }

    public void run()
    {
        System.out.println("Uruchamiam " + nazwaKomponantu + " ");
    }
}
