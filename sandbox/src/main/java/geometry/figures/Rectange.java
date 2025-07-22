package geometry.figures;

public record Rectangle (double a, double b ) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(this.a, rectangle.a) == 0 && Double.compare(this.b, rectangle.b) == 0
                || Double.compare(this.a, rectangle.b) == 0 && Double.compare(this.b, rectangle.a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public Rectangle {
        if (a < 0 || b < 0 ) {
            throw new IllegalArgumentException("Rectangle's side should be not a negative");
        }
    }


    public static void printRectangleArea(double a, double b) {
        System.out.println(String.format(
                "Площадь прямоугольника со стороной %f и  %f  = %f",a, b, RectangleArea(a, b)));
    }

    public static double RectangleArea(double a, double b) {
        return a * b;
    }
}
