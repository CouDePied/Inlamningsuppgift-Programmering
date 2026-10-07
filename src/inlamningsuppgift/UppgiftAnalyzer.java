package inlamningsuppgift;

public class UppgiftAnalyzer {

    //Skriv ett program som läser in text från kommandoraden rad för rad tills användaren skriver ordet stop.
    //När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
    // exlusive raden med ordet stop.
    //Programmet ska bestå av två klasser: En klass som läser in text och skriver ut resultatet till användaren
    //Del3 Vidareutveckla ditt program i del två så att det gör följande
    //Skriver ut antal ord (separerade med blanksteg)
    //Skriver ut det längsta ordet

    //Programmet ska bestå av två klasser

    //En annan klass som
    //Räknar raderna, antal tecken, och antal ord
    //Har koll på det längsta ordet
    //Har koll på om användaren har skrivit ordet stop eller inte
    //Programmet ska fortfarande ha minst tre testfall och läggas upp på samma sätt i github som i del 2.


    // Ansvarar för att analysera inmatad text.
    // Håller koll på räkningen antal rader, tecken, ord samt det längsta ordet.
    // Ansvarar även för att avgöra om en given rad signalerar "stop".

//Logikklassen

    private int lineCount;
    private int charCount;
    private int wordCount;
    private String longestWord = "";
    //Kan man använda en while (!text.equals("stop"))
    //Boolean ändras när vi sparar antal
    //Hämtar en boolena från logikklassen
    // Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i logikklassen
    //DEn här Ser om raden ska tolkas som stop kommando
    public boolean isStop(String line) {

        return line.trim().equals("stop");
    }

//Ordningen avgör. Från scanner kommer frågan
// och Om break blir så körs aldrig processLine igen
    //Och därför räknas inte raden med stop med.


    public void processLine(String line) {

        lineCount++;
        charCount += line.length();

        String trimmed = line.trim();
        String[] words = trimmed.split(" ");
        for (String word : words) {     //Går igenom arrayen ett ord i taget.

            wordCount++;   //Bearbetar och räknar varje ord som loopen pekar på.

            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }
    }


    public int getLineCount() {

        return lineCount;
    }

    public int getCharCount() {

        return charCount;
    }

    public int getWordCount() {

        return wordCount;
    }

    public String getLongestWord() {

        return longestWord;
    }
}




