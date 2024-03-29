package com.company;

public class Triangle {

private double a;
private double b;
private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double countArea(){
        double p = (a+b+c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        try {
            if (area == 0) {
                throw new IllegalArgumentException();
            }

        }
        catch (Exception e){
            System.out.print(this.toString() + "input values are not correct, area = ");

        }
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
