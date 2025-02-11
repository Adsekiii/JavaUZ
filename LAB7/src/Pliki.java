import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pliki {


    public void WriteToFileTXT(String text) {

        try{
            File file = new File("Plik.txt");
            if(!file.exists()) {
                System.out.println("no file found!");
                return;
            }

            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
            System.out.println("File written!");

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
    public void CreateFileTXT(){
        try{
            File file = new File("Plik.txt");
            if(file.createNewFile())
            {
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public void ReadFromFileTXT() {
        try{
            File file = new File("Plik.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void WriteToFileCSV(String text) {

        try{
            File file = new File("Plik.csv");
            if(!file.exists()) {
                System.out.println("no file found!");
                return;
            }

            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
            System.out.println("File written!");

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
    public void CreateFileCSV(){
        try{
            File file = new File("Plik.csv");
            if(file.createNewFile())
            {
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public void ReadFromFileCSV() {
        try{
            File file = new File("Plik.csv");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
