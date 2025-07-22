package ru.korsak.geometry.figures;
import geometry.figures.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception){
            //ok
        }
    }

    @Test
    void testEquality() {
        var r1 = new Rectangle(4.0, 5.0);
        var r2 = new Rectangle(5.0, 4.0);
        Assertions.assertTrue(r1.equals(r2));
    }

}
