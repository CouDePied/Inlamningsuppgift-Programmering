package inlamningsuppgift;

import java.util.Scanner;

public class MightyScaninator3000 {


//En klass som läser in text från kommandoraden och skriver ut resultatet till användaren

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

        System.out.println("Skriv text rad för rad. Skriv sen ordet stop för att avsluta.");




        //Loopen körs för evigt om inget stop.
        //Programmet pausar och väntar(genom scan.nextLine())
        // tills användaren skrivit och tryckt enter.
        //Loopen fortsätter så länge isRunning returnerar true.

        while (analyzer.isRunning()) {
            analyzer.processLine(scan.nextLine());
            //Skickar den inlästa raden till UppgiftAnalyzer som avgör.
            //Scanner gör ingen jämförelse med stop.
            //Den kollar bara om isRunning är true.
            //Agerar sen på svaret.


        }

        System.out.println("Antal rader: " + analyzer.getLineCount());
        System.out.println("Antal tecken: " + analyzer.getCharCount());
        System.out.println("Antal ord: " + analyzer.getWordCount());
        System.out.println("Längsta ordet: " + analyzer.getLongestWord());


    }
}



