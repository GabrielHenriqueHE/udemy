/*
* Fazer um programa para ler quatro valores inteiros A, B, C e D.
* A seguir, calcule e mostre a diferença do produto de A e B
* pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args) {

        int A, B, C, D;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        A = sc.nextInt();

        System.out.println("Insira o valor de B: ");
        B = sc.nextInt();

        System.out.println("Insira o valor de C: ");
        C = sc.nextInt();

        System.out.println("Insira o valor de D: ");
        D = sc.nextInt();

        System.out.printf("DIFERENCA = %d", A * B - C * D);

    }
}
