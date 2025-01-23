package ru.korsak.geometery.figures;

import static java.lang.Math.sqrt;

public record Triangle(
        double a,
        double b,
        double c

) {

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
