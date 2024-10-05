package heranca_e_polimorfismo.aula165exercicio.entities;

import heranca_e_polimorfismo.aula165exercicio.enums.Color;

import java.lang.Math;

public class Circle extends Shape {
    private Double radius;

    public Circle() {}
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
