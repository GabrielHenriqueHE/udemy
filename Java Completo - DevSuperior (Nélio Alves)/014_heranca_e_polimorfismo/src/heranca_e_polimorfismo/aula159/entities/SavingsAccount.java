package heranca_e_polimorfismo.aula159.entities;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance += this.balance * (this.interestRate / 100);
    }

    @Override
    public void withDraw(double amount) {
        this.balance -= amount;
    }
}
