/* Fazer um programa para ler um número inteiro
* e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

    }
}