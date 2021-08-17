import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Areacalculation {

    @Test
    void tocheckareaofrectanglewithlengthfortyfiveandbreadththirtysix()
    {
        Rectangle rectangle = new Rectangle(45,36);
        int currentvalue = rectangle.area();
        int expectedvalue = 1620;
        Assertions.assertEquals(expectedvalue,currentvalue);
    }

    @Test
    void tocheckperimeterofrectanglewithlengthfortyfiveandbreadththirtysix()
    {
        Rectangle rectangle = new Rectangle(5,6);
        int currentvalue = rectangle.area();
        int expectedvalue = 30;
        Assertions.assertEquals(expectedvalue,currentvalue);
    }

}
