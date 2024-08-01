package composicao.desafio.domain.entities;

import composicao.desafio.domain.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    private final double baseSalary;
    private final Department department;

    private final List<Contract> contracts = new ArrayList<Contract>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        List<Contract> monthContracts = this.contracts.stream().filter(
            x -> (x.getContractDate().getYear() == year) &&
            (x.getContractDate().getMonthValue() == month)
        ).toList();

        double monthIncomes = this.baseSalary;

        for (Contract contract : monthContracts) {
            monthIncomes += contract.totalValue();
        }

        return monthIncomes;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
