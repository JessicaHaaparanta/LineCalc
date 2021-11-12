package lineCalc;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Testfall {

    @Test
    public void testgetNumberofLines(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        int actual = myCounter.getNumberofLines();

        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testgetNumberofCharactera(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        int actual = myCounter.getNumberofCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddLines(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        myCounter.addLines();
        myCounter.addLines();
        myCounter.addLines();
        myCounter.addLines();
        int actual = myCounter.getNumberofLines();

        //Assert

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddCharacters(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        myCounter.addCharacters("Hur mår du");
        int actual = myCounter.getNumberofCharacters();

        //Assert
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    public void testendWord(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        myCounter.addCharacters("Stop");
        boolean actual = myCounter.getendWord();

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void testnotendWord(){
        //Arrange
        Counter myCounter = new Counter();

        //Act
        myCounter.addCharacters("Hallå");
        boolean actual = myCounter.getendWord();

        //Assert
        boolean expected = false;

        assertEquals(expected, actual); }


}



