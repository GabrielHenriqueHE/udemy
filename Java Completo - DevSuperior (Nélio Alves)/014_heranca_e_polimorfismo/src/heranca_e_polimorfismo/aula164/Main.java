package heranca_e_polimorfismo.aula164;

import heranca_e_polimorfismo.aula164.entities.Account;
import heranca_e_polimorfismo.aula164.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // Account x = new Account(1020, "Alex", 1000);
        Account y = new SavingsAccount(1021, "Maria", 1000, 0.01);

        // x.withDraw(50); // Utiliza o método withDraw da classe Account
        y.withDraw(50); // Utiliza o método withDraw da classe SavingsAccount

        // System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        // O polimorfismo representa a possibilidade de criar métodos com comportamentos diferentes.
    }
}
