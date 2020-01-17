import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class WriteToFile {
    public static void main(String args[]) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        Hashtable<String, String> band1 = new Hashtable<String, String>();
        band1.put("Artist", "Three Days Grace");
        band1.put("Date", "11/14/2020");
        band1.put("Price", "$25");

        Hashtable<String, String> band2 = new Hashtable<String, String>();
        band2.put("Artist", "3 Doors Down");
        band2.put("Date", "4/4/2020");
        band2.put("Price", "$15");

        System.out.println(band1.get("Artist") + " -> " + band1.get("Price"));
        System.out.println(band2.get("Artist") + " -> " + band2.get("Price"));
        Scanner myObj = new Scanner(System.in);
        String bandChoice;
        System.out.println("What band would you like to see?");
        bandChoice = myObj.nextLine();
        myObj.close();

        if (bandChoice.equals(band1.get("Artist"))) {
            System.out.println("Great! Your total is " + band1.get("Price"));
            System.out.println("See you on " + band1.get("Date") + "!");

            try {
                fw = new FileWriter("Transactions.txt", true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.println("1 ticket for: " + bandChoice + " = " + band1.get("Price"));

                pw.flush();

            } finally {
                try {
                    pw.close();
                    bw.close();
                    fw.close();
                } catch (IOException io) {
                }
            }
        } else if (bandChoice.equals(band2.get("Artist"))) {
            System.out.println("Great! Your total is " + band2.get("Price"));
            System.out.println("See you on " + band2.get("Date") + "!");

            try {
                fw = new FileWriter("Transactions.txt", true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.println("1 ticket for: " + bandChoice + " = " + band1.get("Price"));

                pw.flush();

            } finally {
                try {
                    pw.close();
                    bw.close();
                    fw.close();
                } catch (IOException io) {
                }
            }
        } else {
            System.out.println("INVALID INPUT");
        }

    }
}