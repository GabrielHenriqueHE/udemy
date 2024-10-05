package aula178fixacao;

import aula178fixacao.model.entities.Account;
import aula178fixacao.model.exceptions.AccountException;

public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account(10, "Gabriel", 20000.00, 1000.00);
            account.deposit(0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }
    }
}
