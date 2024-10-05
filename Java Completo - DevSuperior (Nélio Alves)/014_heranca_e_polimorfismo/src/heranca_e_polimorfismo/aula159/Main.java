package heranca_e_polimorfismo.aula159;

import heranca_e_polimorfismo.aula159.entities.Account;
import heranca_e_polimorfismo.aula159.entities.BusinessAccount;
import heranca_e_polimorfismo.aula159.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.withDraw(200.00);
        System.out.println(acc1.getBalance());

        SavingsAccount acc2 = new SavingsAccount();
        acc2.withDraw(200.00);
        System.out.println(acc2.getBalance());

        BusinessAccount acc3 = new BusinessAccount();
        acc3.withDraw(300);
        System.out.println(acc3.getBalance());
    }
}
