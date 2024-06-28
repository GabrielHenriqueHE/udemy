// Entrada de dados em Java - Parte 1

import java.util.Locale;
import java.util.Scanner;

public class Aula26 {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Insira mais um número inteiro: ");
        int n2 = sc.nextInt();
        sc.close();
        System.out.printf("Resultado: %d", n1 + n2);

    }
}
