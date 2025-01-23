package ru.korsak.geometery;

import ru.korsak.geometery.figures.Rectangle;
import ru.korsak.geometery.figures.Square;

public class Geometry {

    public static void main(String[] args)
    {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(8.0));
        Square.printSquareArea(new Square(9.0));
        
        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(2.0, 8.0);

    }

}
