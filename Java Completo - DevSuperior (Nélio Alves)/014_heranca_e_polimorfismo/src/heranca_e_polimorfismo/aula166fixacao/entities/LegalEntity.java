package heranca_e_polimorfismo.aula166fixacao.entities;

public class LegalEntity extends Contributor {
    private Integer employeesNumber;

    public LegalEntity() {}
    public LegalEntity(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public double calculateContributionTax() {
        boolean moreThanTenEmployees = this.employeesNumber > 10;

        if (moreThanTenEmployees)
            return this.annualIncome * ((double) 14/100);
        else
            return this.annualIncome * ((double) 16/100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(this.name).append("\n");
        sb.append("Renda anual: R$").append(this.annualIncome).append("\n");
        sb.append("Número de funcionários: ").append(this.employeesNumber).append("\n");

        return sb.toString();
    }
}
