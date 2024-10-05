/*

Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio²

Considere o valor de π = 3.14159

*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        double raio;
        double pi = 3.14159;

        System.out.println("Insira o valor do raio: ");

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);


    }
}
