/* Fazer um programa que leia três valores com ponto
flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A, B, C, pi;

        pi = 3.14159;

        double area_tri_ret, area_circ, area_trap, area_quad, area_ret;

        System.out.println("Insira 3 valores de ponto flutuante: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // a)

        area_tri_ret = (A * C) / 2;
        area_circ = pi * Math.pow(C, 2);
        area_trap = ((A + B) * C) / 2;
        area_quad = Math.pow(B, 2);
        area_ret = A * B;

        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f", area_tri_ret, area_circ, area_trap, area_quad, area_ret);

    }
}
