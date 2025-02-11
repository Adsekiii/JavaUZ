public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(1,2,3,4,5,6,7);

        System.out.println(kalkulator.dodawanie());

        Pliki p = new Pliki();

        p.CreateFileTXT();
        p.WriteToFileTXT("Całkowicie inny tekst\nnastępna linia\nkolejna\n\n\n\n\n\ni kolejna");
        p.ReadFromFileTXT();

        p.CreateFileCSV();
        p.WriteToFileCSV("lp.,imie,nazwisko\n1.,Adrian,Ż\n2.,Jan,P");
        p.ReadFromFileCSV();
    }
}
