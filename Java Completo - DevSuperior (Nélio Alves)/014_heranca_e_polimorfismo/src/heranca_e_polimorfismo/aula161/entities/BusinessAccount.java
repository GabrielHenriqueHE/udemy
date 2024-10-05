package heranca_e_polimorfismo.aula161.entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (!(amount > this.loanLimit)) {
            this.balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
        this.balance -= 2.00;
    }
}
