/* Faça um programa para ler dois valores inteiros,
e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        b = sc.nextInt();

        System.out.printf("Soma = %d", a + b);

    }
}
