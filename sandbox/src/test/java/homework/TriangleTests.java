package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korsak.geometery.figures.Rectangle;

public class TriangleTests {


    @Test
    void testEquality2() {
        var t1 = new Triangle(5.0, 4.0, 3.0);
        var t2 = new Triangle(3.0, 4.0, 5.0);

        Assertions.assertTrue(t1.equals(t2));

    }
}
