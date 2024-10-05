package heranca_e_polimorfismo.aula165exercicio.entities;

import heranca_e_polimorfismo.aula165exercicio.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {}
    public Shape(Color color) {
        this.color = color;
    }

    abstract Double area();
}
