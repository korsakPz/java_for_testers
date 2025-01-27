//Задание №2: Потренироваться использовать функции, классы, объекты и методы

package ru.korsak.geometery.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) { //Задание №3: Потренироваться использовать ветвление и исключения
    public Triangle{
        if (a < 0 || b < 0 || c < 0 ) {
            throw new IllegalArgumentException("Triangle mast only positive side");
        }
        if ((a + b) > c ){
            System.out.println("OK");
        }
    }

    static double area;

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double calculateP() {
        double pCalc =  perimeter()/2;
        area = sqrt(pCalc * (pCalc - this.a) * (pCalc - this.b) * (pCalc - this.c));
        return area;
    }
}
