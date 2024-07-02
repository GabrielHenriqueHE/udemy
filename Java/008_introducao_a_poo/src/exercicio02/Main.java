package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do colaborador: (Nome, salário e desconto)");
        Employee e1 = new Employee(sc.nextLine(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Insira a % de aumento para o funcionário: ");
        e1.increaseSalary(sc.nextDouble());

    }

}
