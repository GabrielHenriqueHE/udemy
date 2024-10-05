package heranca_e_polimorfismo.aula166fixacao.entities;


public abstract class Contributor {
    protected String name;
    protected Double annualIncome;

    public Contributor() {}
    public Contributor(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double calculateContributionTax();
}
