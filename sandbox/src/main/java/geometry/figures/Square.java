package geometry.figures;

public record Square (double side) {

    public Square {
        if (side <= 0) {
            throw new IllegalArgumentException("Side should be not a negative");
        }
    }

    public static void printSquareArea(Square s) {
        System.out.println(String.format(
                "Площадь квадрата со стороной %f = %f", s.side, s.Area()));

    }

    public double Area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}