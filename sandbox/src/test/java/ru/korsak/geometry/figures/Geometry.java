package ru.korsak.geometry.figures;

import geometry.figures.Rectangle;
import geometry.figures.Square;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Geometry {
    public static void main(String[] args) {

        Supplier<Square> randomeSquare = () -> new Square(new Random().nextDouble(100.0));
        var squares = Stream.generate(randomeSquare).limit(5);


        squares.peek(Square::printSquareArea).forEach(Square::printSquareArea);




    }
}
