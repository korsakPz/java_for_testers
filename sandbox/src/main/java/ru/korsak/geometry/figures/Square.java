package ru.korsak.geometry.figures;

public class Square {
    public static void printSquareArea(double sideOfCuadro){
        String whatWhat = String.format("Площадь квадрата равна %f ", area(sideOfCuadro));
        System.out.println(whatWhat);
    }

    public static double area(double sideOfCuadro) {
        return sideOfCuadro * sideOfCuadro;
    }

    public static double perimeter(double sideOfCuadro) {
        return 4 * sideOfCuadro;
    }
}
