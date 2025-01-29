package ru.korsak.geometery.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void testNonEquality() {
        var s1 = new Square(5.0);
        var s2 = new Square(4.0);
        Assertions.assertNotEquals(s1, s2);
    }

    @Test
    void testFail() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertTrue(s1.equals(s2));

    }


}
