package ru.mirea.prac3.ex1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Длина круга: " + circle.getLength());
        System.out.println("Площадь круга: " + circle.getSquare());
    }
}
