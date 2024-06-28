/* Fazer um programa que leia o número de um funcionário
* seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário.
*  A seguir, mostre o número e o salário do funcionário,
* com duas casas decimais. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        short n;
        short horas_trabalhadas;
        float valor_hora;

        float salario;

        System.out.println("Insira o seu número: ");
        n = sc.nextShort();

        System.out.println("Insira o número de horas trabalhadas: ");
        horas_trabalhadas = sc.nextShort();

        System.out.println("Insira o valor que recebe por hora trabalhada: ");
        valor_hora = sc.nextFloat();

        salario = horas_trabalhadas * valor_hora;

        System.out.printf("NUMBER = %d\n", n);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
