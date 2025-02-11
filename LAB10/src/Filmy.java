import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filmy extends Thread{

    private String filename;

    private int id_filmu;
    private int id_uzytkownika;
    private int ocena;
    private String data_glosowania;

    @Override
    public String toString() {
        return
                "id_filmu=" + id_filmu +
                ", id_uzytkownika=" + id_uzytkownika +
                ", ocena=" + ocena +
                ", data_glosowania='" + data_glosowania + '\n' ;
    }

    public void run()
    {
        try
        {
            FileWriter fw = new FileWriter(this.filename, true);
            BufferedWriter writer = new BufferedWriter(fw);

            writer.write(this.toString());

            writer.write("\n");
            writer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public Filmy(String filename, int id_filmu, int id_uzytkownika, int ocena, String data_glosowania)
    {
        this.filename = filename;
        this.id_filmu = id_filmu;
        this.id_uzytkownika = id_uzytkownika;
        this.ocena = ocena;
        this.data_glosowania = data_glosowania;
    }
}
