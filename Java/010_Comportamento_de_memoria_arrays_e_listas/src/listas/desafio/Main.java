package listas.desafio;

import listas.desafio.dto.EmployeeDTO;
import listas.desafio.entities.Employee;
import listas.desafio.repositories.EmployeesRepository;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public final static EmployeesRepository employeesRepository = new EmployeesRepository();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;

        while (true) {
            System.out.print("Quantos funcionários vão ser registrados? ");
            op = sc.nextInt();

            if (op >= 1) {
                break;
            } else {
                System.out.println("Valor inválido.");
            }
        }

        for (int i = 0; i < op; i++) {
            System.out.printf("Funcionário #%d\n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employeesRepository.save(employee);
        }

        System.out.print("Insira o ID do funcionário que receberá o aumento: ");
        int id = sc.nextInt();
        System.out.print("Insira quantos % de aumento: ");
        double percent = sc.nextDouble();

        Employee e1 = employeesRepository.getById(id);

        employeesRepository.update(id, new EmployeeDTO((e1.getSalary() + (e1.getSalary() * percent / 100))));

        List<Employee> employees = employeesRepository.getAll();

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
