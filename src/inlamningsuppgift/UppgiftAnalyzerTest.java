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

            int actualLines = analyzer.getLineCount();
            int actualCharacters = analyzer.getCharCount();
            int expectedLines = 2;
            int expectedCharacters = 8;

            //Assert
            assertEquals(expectedLines, actualLines);
            assertEquals(expectedCharacters, actualCharacters);

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

            int actual = analyzer.getWordCount();
            int expected = 3;
            //Assert
            assertEquals(expected, actual);



        }
        @Test
        public void FindLongestWordTest() {
            //Kontrollerar att programmet hittar det längsta ordet
            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            //Act
            analyzer.processLine("Jag gillar mörk choklad och katter");

            String actual = analyzer.getLongestWord();
            String expected = "choklad";
            //Assert
            assertEquals(expected, actual);



        }
        //Kollar att om mellanslag ska inte skapa extra ord.

        @Test
        public void CountWordsWithMultipleSpaces() {

            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            //Act
            analyzer.processLine("Jag  gillar  katter");

            int actual = analyzer.getWordCount();
            int expected = 3;
            //Assert
            assertEquals(expected, actual);




        }
        //Kontrollerar om/att programmet räknar text.
        //Att siffrorna behandlas som text.
        @Test
        public void CountNumbersAsWordsTest() {

            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

            //Act
            analyzer.processLine("123 456 789");

            int actual = analyzer.getWordCount();
            int expected = 3;

            assertEquals(expected, actual);




        }
        //Testar en tom textsträng och ser om line.length
        //Fungerar om den är tom.
        @Test
        public void CountEmptyLineAsZeroCharacters() {
            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            //Act
            analyzer.processLine("");

            int actual = analyzer.getCharCount();
            int expected = 0;

            //Assert
            assertEquals(expected, actual);



        }
        //Kontrollerar om logiken i stop fungerar som den ska
        @Test
    public void StopTest() {
//Arrange

UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

//Act
   boolean actual = analyzer.isStop("stop");
   boolean expected = true;
   //Assert
            assertEquals(expected, actual);


    }

}






