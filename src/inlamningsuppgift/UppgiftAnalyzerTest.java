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
    public void CountLinesTest() {
        //Testar att processLine() räknar upp antalet rader korrekt
        // (och att getLineCount() returnerar rätt antal rader.)

        //Arrange
        UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
        //Act
        analyzer.processLine("Hej");
        analyzer.processLine("Vad heter du?");

        int actual = analyzer.getLineCount();
        int expected = 2;

        //Assert
        assertEquals(expected, actual);


    }
@Test
public void CountCharactersTest() {
        //Testar att programmet räknar antal tecken.
    //processLine() gör själva räknandet
    //Och getCharCount() hämtar resultatet.
        //Arrange
    UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

    //Act
    analyzer.processLine("Hej");
    analyzer.processLine("Jag heter Rebecca");

    int actual = analyzer.getCharCount();
    int expected = 20;

    //Assert
    assertEquals(expected, actual);



        }
        @Test
        public void CountWordsTest() {
            //Testar ordräknaren.
            //Arrange
            UppgiftAnalyzer analyzer = new UppgiftAnalyzer();
            //Act
            analyzer.processLine("Jag gillar katter");

            int actual = analyzer.getWordCount(); // Klicka på Create method
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
        //Kontrollerar om/att programmet räknar text.
        //Om siffror behandlas som text.
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
    public void StopReturnsTrueTest() {
//Arrange

UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

//Act
   boolean actual = analyzer.isStop("stop");
   boolean expected = true;
   //Assert
            assertEquals(expected, actual);


    }
@Test
        public void StopReturnsFalseTest() {
    UppgiftAnalyzer analyzer = new UppgiftAnalyzer();

    boolean actual = analyzer.isStop("Hej");
    boolean expected = false;

    assertEquals(expected, actual);

}

}






