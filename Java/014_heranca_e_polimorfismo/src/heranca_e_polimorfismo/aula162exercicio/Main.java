package heranca_e_polimorfismo.aula162exercicio;

import heranca_e_polimorfismo.aula162exercicio.entities.Employee;
import heranca_e_polimorfismo.aula162exercicio.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Insira quantos funcionários deseja registrar: ");
        int employeeNumber = sc.nextInt();

        for (int i = 0; i < employeeNumber; i++) {
            System.out.printf("Informe os dados para o funcionário %d\n", i + 1);
            System.out.print("Terceirizado? (S/N) ");
            char option = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Valor recebido por hora: ");
            double valuePerHours = sc.nextDouble();
            sc.nextLine();

            if (option == 'S') {
                System.out.print("Insira os gastos adicionais: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHours));
            }
        }

        for (Employee employee : employees) {
            System.out.printf("%s - R$%.2f", employee.getName(), employee.payment());
        }

    }
}
