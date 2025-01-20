public class Geometry {
    public static void main(String[] args) {

        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(4.0);

        printReatangleArea(3.0,  5.0);
        printReatangleArea(7.0,9.0);


    }

    private static void printReatangleArea(double oneLine, double nextLine1) {
        System.out.println("Площадь прямоугльника равна " + rectangleArea(oneLine, nextLine1));
    }

    private static double rectangleArea(double oneLine, double nextLine1) {
        return oneLine * nextLine1;
    }

    static void printSquareArea(double sideOfCuadro){
        System.out.println("Площадь квадрата равна " + squareArea(sideOfCuadro));
    }

    private static double squareArea(double sideOfCuadro) {
        return sideOfCuadro * sideOfCuadro;
    }

}
