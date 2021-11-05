package lineCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Testfall{

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
        int actual = myCounter.getNumberofLines();

        //Assert

        int expected = 1;

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
        int expected = 3;

        assertEquals(expected, actual);
    }


}

