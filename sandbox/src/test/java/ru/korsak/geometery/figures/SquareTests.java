package ru.korsak.geometery.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {


    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void testEquality() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(5.0, 4.0);
        Assertions.assertTrue(r1.equals(r2));
    }

    @Test
    void testEquality2() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(4.0, 5.0);
        Assertions.assertTrue(r1.equals(r2));
    }

}
