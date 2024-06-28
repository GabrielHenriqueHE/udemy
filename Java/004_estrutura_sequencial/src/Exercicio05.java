/* Fazer um programa para ler o código de uma peça 1,
o número de peças 1, , o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2
e o valor unitário de cada peça 2.

Calcule e mostre o valor a ser pago. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        short cod_peca, num_peca;
        float valor_unit, valor_pagar;

        System.out.println("Insira o código da peça, o número de peças e o valor unitário: ");
        cod_peca = sc.nextShort();
        num_peca = sc.nextShort();
        valor_unit = sc.nextFloat();

        valor_pagar = num_peca * valor_unit;

        System.out.println("Insira o código da peça, o número de peças e o valor unitário: ");
        cod_peca = sc.nextShort();
        num_peca = sc.nextShort();
        valor_unit = sc.nextFloat();

        valor_pagar += num_peca * valor_unit;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valor_pagar);

    }

}
