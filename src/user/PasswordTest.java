package user;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PasswordTest {

    @Test
    public void testGetPassword() {

        // Arrange

        String Password = "abc123";

        Password myPassword = new Password();

        //Act
        String actual = myPassword.GetPassword();

        //Assert
        String expected = "abc123";
        assertEquals(expected, actual);

    }
}
