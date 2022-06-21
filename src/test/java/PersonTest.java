import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void getName() {
        //Arrange
        Person test = new Person("Adrien" , "L'Honoré Naber" , "Male" , "36");
        // Act
        String result = test.getName();
        // Assert
        Assertions.assertEquals("Adrien", result);
    }

    @Test
    public void getFather(){
        Person test = new Person("Adrien" , "L'Honoré Naber" , "Male" , "36");
        Person testFather = new Person("Henri" , "L'Honoré Naber" , "Male" , "76")
        test.setFather(testFather);

        Person result = test.getFather();

        Assertions.assertEquals(testFather , result);

        // comment voor pushen

    }
}
