import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
//        Pattern oddziel = Pattern.compile("[a-zA-ZęółśążźćńĘÓŁŚĄŻŹĆŃ]{1,}\\b");
//        Scanner skan = new Scanner(System.in);
//        String input = skan.nextLine();
//        skan.close();
//        Matcher porownaj = oddziel.matcher(input);
//        while(porownaj.find()) {
//            System.out.println(porownaj.group());
//        }


//        ArrayList<Student> list = new ArrayList<Student>(5);
//        list.add(new Student());
//        list.add(new Student());
//        list.add(new Student());
//        list.add(new Student());
//        list.add(new Student());
//
//        list.get(2).setImie("Stefan");
//        list.get(2).setNazwisko("Stefan");
//        list.get(2).setNrIndexu(123321);
//
//        System.out.println(list.get(2).getImie() + " " + list.get(2).getNazwisko() + " " + list.get(2).getNrIndexu());


        Pattern majl = Pattern.compile("[a-z0-9]{1,}[a-z0-9\\._-]{3,}@[a-z0-9]{1,}[a-z0-9\\._-]\\.[a-z]{2,}");

        Scanner sc = new Scanner(System.in);
        String zdanie = sc.nextLine();

        Matcher matcher = majl.matcher(zdanie);

        System.out.println(matcher.matches());

//        Pattern pat = Pattern.compile("[A-Za-z]");
//        //Pattern pat = Pattern.compile("sobota jest wolna");
//        //Pattern pat = Pattern.compile("wolna");
//        Matcher matcher1 = pat.matcher("sobota jest wolna");
//
//        System.out.println(matcher1.find());
//        System.out.println(matcher1.matches());



    }
}
