package exercicio02;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee (String name, double grossSalary, double tax) {

        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;

        System.out.printf("Colaborador: %s. Salário: R$%.2f\n", this.name, this.netSalary());

    }

    public double netSalary () {

        return this.grossSalary - this.tax;

    }

    public void increaseSalary (double percentage) {

        this.grossSalary += (this.grossSalary * (percentage / 100));
        System.out.printf("Dados atualizados do colaborador: %s. Salário: R$%.2f\n", this.name, this.netSalary());

    }

}
