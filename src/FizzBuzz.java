package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class FizzBuzzTest {

    @Test
    public void test () {
        // Arrange
        FizzBuzz fizz = new FizzBuzz ();

        int testdata = 1;

        // Act
        String actual = fizz.getText(testdata);


        // Assert
        String expected = "1";
        assertEquals (expected, actual);
    }

}
