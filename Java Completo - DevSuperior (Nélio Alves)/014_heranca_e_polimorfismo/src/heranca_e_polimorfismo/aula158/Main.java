package heranca_e_polimorfismo.aula158;

import heranca_e_polimorfismo.aula158.entities.Account;
import heranca_e_polimorfismo.aula158.entities.BusinessAccount;
import heranca_e_polimorfismo.aula158.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Gabriel", 120.00);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

        // Upcasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 200.00, 300.00);

        // Downcasting -- nem sempre vai dar certo.

        // BusinessAccount acc4 = acc2; -- Não é permitido.
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        BusinessAccount acc5 = (BusinessAccount) acc3;

    }
}
