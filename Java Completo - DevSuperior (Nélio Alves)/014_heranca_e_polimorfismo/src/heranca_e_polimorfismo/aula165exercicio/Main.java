package heranca_e_polimorfismo.aula165exercicio;

import heranca_e_polimorfismo.aula165exercicio.entities.Circle;
import heranca_e_polimorfismo.aula165exercicio.entities.Rectangle;
import heranca_e_polimorfismo.aula165exercicio.enums.Color;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(Color.BLACK, 4.0, 5.0);
        System.out.printf("%.2f\n", rectangle.area());

        Circle circle = new Circle(Color.RED, 3.0);
        System.out.printf("%.2f\n", circle.area());
    }
}
