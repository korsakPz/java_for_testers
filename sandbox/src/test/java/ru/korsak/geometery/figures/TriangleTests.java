//Задание №2: Потренироваться использовать функции, классы, объекты и методы

package ru.korsak.geometery.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void checkPerimeterOfTriangle(){
        var p = new Triangle(10.0, 20.0, 30.0);
        double resultPer = p.perimeter();
        Assertions.assertEquals(42.0, resultPer);
    }

    @Test
    void checkAreaOfTriangle(){
        var pEp = new Triangle(13.0, 14.0, 15.0);
        double resultP = pEp.calculateP();
        Assertions.assertEquals(84.0, resultP);


    }
}
