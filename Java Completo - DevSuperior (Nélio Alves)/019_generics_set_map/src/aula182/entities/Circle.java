package aula182.entities;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}