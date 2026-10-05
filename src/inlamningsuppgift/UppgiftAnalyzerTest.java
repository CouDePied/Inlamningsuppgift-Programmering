package inlamningsuppgift;

// till programmet ska minst tre Junit testfall skrivas
//Testfallen ska skilja sig märkbart åt och testa olika delar av programmet

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class UppgiftAnalyzerTest {

    //assertEquals
//assertNotEquals
//Arrange-Vilka värden ska vi testa mot?(Testdata)
//Objekten för vad vi ska testa. Var börjar vi?
//Act-Själva beräkningen av klassen eller metoden.
//Sparar resultatet.(Actual.)
//Assert-Jämför om vi fick rätt resultat.


        @Test
        public void CountLinesAndCharactersTest() {
            //Testar processLine(), getLineCount() och getCharCount().
            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            //Act
            analyzer.processLine("Hej");
            analyzer.processLine("Hello");
            //Assert
            assertEquals(2, analyzer.getLineCount());
            assertEquals(8, analyzer.getCharCount());
            //Hej = 3 tecken
            //Hello = 5 tecken
            //DEt blir totalt 8

        }
        @Test
        public void CountWordsTest() {
            //Testar ordräknaren.
            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            //Act
            analyzer.processLine("Jag gillar katter");
            //Assert
            assertEquals(3, analyzer.getWordCount());

        }
        @Test
        public void FindLongestWordTest() {
            //Kontrollerar att programmet hittar det längsta ordet
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            analyzer.processLine("Jag gillar mörk choklad och katter");
            assertEquals("choklad", analyzer.getLongestWord());

        }
        //Kollar att om mellanslag ska inte skapa extra ord.

        @Test
        public void CountWordsWithMultipleSpaces() {
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            analyzer.processLine("Jag  gillar  katter");

            assertEquals(3, analyzer.getWordCount());


        }
        //Kontrollerar om/att programmet räknar text.
        //Att siffrorna behandlas som text.
        @Test
        public void CountNumbersAsWordsTest() {
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            analyzer.processLine("123 456 789");

            assertEquals(3, analyzer.getWordCount());

        }
        //Testar en tom textsträng och ser om line.length
        //Fungerar om den är tom.
        @Test
        public void CountEmptyLineAsZeroCharacters() {
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            analyzer.processLine("");

            assertEquals(0, analyzer.getCharCount());

        }

    }






