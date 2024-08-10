package heranca_e_polimorfismo.aula166fixacao.entities;

public class NaturalPerson extends Contributor {
    private Double healthExpenses;

    public NaturalPerson() {}
    public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double calculateContributionTax() {
        boolean hadHealthExpenses = this.healthExpenses > 0;

        if (this.annualIncome < 20000) {
            if (hadHealthExpenses) {
                return (this.annualIncome * ((double) 15/100) - (this.healthExpenses * ((double) 50/100)));
            } else {
                return (this.annualIncome * ((double) 15/100));
            }
        } else {
            if (hadHealthExpenses) {
                return (this.annualIncome * ((double) 25/100) - (this.healthExpenses * ((double) 50/100)));
            } else {
                return (this.annualIncome * ((double) 25/100));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(this.name).append("\n");
        sb.append("Renda anual: R$").append(this.annualIncome).append("\n");
        sb.append("Despesas médicas: R$").append(this.healthExpenses).append("\n");

        return sb.toString();
    }
}
