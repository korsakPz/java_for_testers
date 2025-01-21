package ru.korsak.geometry.figures;

public class Square {
    public static void printSquareArea(double sideOfCuadro){
        String whatWhat = String.format("Площадь квадрата равна %f = %f", squareArea(sideOfCuadro));
        System.out.println(whatWhat);
    }

    private static double squareArea(double sideOfCuadro) {
        return sideOfCuadro * sideOfCuadro;
    }
}
