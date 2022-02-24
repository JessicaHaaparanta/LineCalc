package Morsekod;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Testfall {

    @Test
    public void testgetMorseCode(){
        //Arrange
        HelloMorse myMorse = new HelloMorse();

        //Act
        String actual =  myMorse.getMorseCode("B");

        //Assert
        String expected = "-***";
        assertEquals(expected, actual);



}
@Test
    public void testUpperCase(){
        //Arrange
    HelloMorse myMorse = new HelloMorse();

    //Act
    String actual = myMorse.getMorseCode("a");

    //Assert
    String expected = "*-";
    assertEquals(expected,actual);

}

@Test
    public void testMorseToletter(){
        //Arrange
    HelloMorse myMorse = new HelloMorse();

    //Act
    String actual = myMorse.getMorseCode("--*--");

    //Assert
    String expected = ",";
    assertEquals(expected,actual);
}


}
