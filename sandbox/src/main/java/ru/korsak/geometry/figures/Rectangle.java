package ru.korsak.geometry.figures;

public class Rectangle {

    public static void printReatangleArea(double oneLine, double nextLine1) {
        System.out.println("Площадь прямоугльника равна " + rectangleArea(oneLine, nextLine1));
    }

    public static double rectangleArea(double oneLine, double nextLine1) {
        return oneLine * nextLine1;
    }
}
