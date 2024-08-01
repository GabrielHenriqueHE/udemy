package composicao.desafio;

import composicao.desafio.domain.entities.Contract;
import composicao.desafio.domain.entities.Department;
import composicao.desafio.domain.entities.Worker;
import composicao.desafio.domain.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do departamento: ");
        String departmentName = sc.nextLine();

        Department department = new Department(departmentName);

        System.out.println("Insira os dados do trabalhador");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível: ");
        String workerLevel = sc.nextLine().toUpperCase();
        System.out.print("Salário base: ");
        double workerSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, department);

        System.out.print("Quantos contratos para esse funcionário? ");
        int numberOfContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.printf("Insira os dados do contrato %d\n", i + 1);
            System.out.print("Data (DD/MM/YYYY): ");
            String date = sc.nextLine();
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração: ");
            int durationInHours = sc.nextInt();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate formattedDate = LocalDate.parse(date, formatter);
            Date contractDate = Date.from(formattedDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            Contract contract = new Contract(contractDate, valuePerHour, durationInHours);
            worker.addContract(contract);
        }

        sc.nextLine();
        System.out.print("Insira o mês e ano para calcular as entradas (MM/YYYY): ");
        String incomesDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth formattedDate = YearMonth.parse(incomesDate, formatter);
        System.out.println(formattedDate);

        double incomesValue = worker.income(formattedDate.getYear(), formattedDate.getMonthValue());
        System.out.printf("Nome: %s\n", worker.getName());
        System.out.printf("Departamento: %s\n", worker.getDepartment().getName());
        System.out.printf("Entradas para o mês %s: %.2f", incomesDate, incomesValue);
    }
}
