package ru.mirea.prac5;

public class main {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1, 1), 10);
        System.out.println(circle);

        System.out.println("Movable Circle:");
        MovableCircle movableCircle = new MovableCircle(circle.getCenter(), circle.getRadius());
        System.out.println(movableCircle.getCenter());
        movableCircle.move(20, 12);
        System.out.println(movableCircle.getCenter());
        // Circle

        System.out.println("Movable Point:");
        MovablePoint movablePoint = new MovablePoint(10, 10);
        System.out.println(movablePoint);
        movablePoint.move(11, 20);
        System.out.println(movablePoint);
        // point
    }
}
