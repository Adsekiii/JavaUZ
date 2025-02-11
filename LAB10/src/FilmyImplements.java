import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilmyImplements implements Runnable{

    private String filename;

    private int id_filmu;
    private int id_uzytkownika;
    private int ocena;
    private String data_glosowania;
    public void run()
    {
        FileReader fr = null;
        try
        {
            fr = new FileReader(this.filename);
            BufferedReader reader = new BufferedReader(fr);

            Scanner scanner = new Scanner(reader);
            int lines = 0;
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
                lines++;
            }

            reader.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public FilmyImplements(String filename)
    {
        this.filename = filename;
    }
}
