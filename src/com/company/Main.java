package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Triangle triangle1 = new Triangle(1,5,6);
        Triangle triangle2 = new Triangle(1.2,1.2,2);


        System.out.println(triangle1.countArea());
        System.out.println(triangle2.countArea());

    }
}
