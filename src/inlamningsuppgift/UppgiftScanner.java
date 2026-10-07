package inlamningsuppgift;

import java.util.Scanner;


    import java.util.Scanner;

    public class UppgiftScanner {


//En klass som läser in text från kommandoraden och skriver ut resultatet till användaren

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            System.out.println("Skriv text rad för rad. Skriv sen ordet stop för att avsluta.");

            //Loopen körs för evigt om inget stop.
            //Programmet pausar och väntar tills användaren skrivit och tryckt enter.
            //Är ordet stop? Annars gå tillbaka och läs en rad igen.
            //Sparas i line.
            //while (true) {
                String line = scan.nextLine();
                while (!analyzer.isStop(line)) {

//Skickar den inlästa raden till UppgiftAnalyzer och frågar.
                //Agerar sen på svaret.
                //if (analyzer.isStop(line)) {
                   // break;



                analyzer.processLine(line);
                line = scan.nextLine();
            }

            System.out.println("Antal rader: " + analyzer.getLineCount());
            System.out.println("Antal tecken: " + analyzer.getCharCount());
            System.out.println("Antal ord: " + analyzer.getWordCount());
            System.out.println("Längsta ordet: " + analyzer.getLongestWord());


        }
    }



