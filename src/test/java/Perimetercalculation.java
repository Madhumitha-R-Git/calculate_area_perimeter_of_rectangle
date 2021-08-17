import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Perimetercalculation {
    @Test
    void tocheckperimeterofrectanglewithlengthfortyfiveandbreadththirtysix()
    {
        Rectangle rectangle = new Rectangle(45,36);
        int currentvalue = rectangle.perimeter();
        int expectedvalue = 162;
        Assertions.assertEquals(expectedvalue,currentvalue);
    }

}
