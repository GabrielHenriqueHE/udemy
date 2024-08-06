package heranca_e_polimorfismo.aula165exercicio.entities;

import heranca_e_polimorfismo.aula165exercicio.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double area() {
        return this.width * this.height;
    }
}
