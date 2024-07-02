package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Insira a base e altura do retângulo: ");
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", r1.getArea(), r1.getPerimeter(), r1.getDiagonal());

    }

}
