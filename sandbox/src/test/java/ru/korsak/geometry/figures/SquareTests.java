package ru.korsak.geometry.figures;

public class SquareTests {




    @Test
    void CanCalculateArea() {
        var s = new Square(5.0);
        var result = s.Area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void CaclucatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception){
            //ok
        }
    }

    @Test
    void testFail() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertTrue(s1.equals(s2));
    }
}
