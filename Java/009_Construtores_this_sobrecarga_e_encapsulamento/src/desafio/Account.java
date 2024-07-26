package desafio;

public class Account {

    private final int numero;
    private String titular;
    private double saldo = 0;


    public Account (int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Account (int numero, String titular, double deposito_inicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = deposito_inicial;
    }

    public void depositar (double valor) {
        try {
            if (valor <= 0) {
                throw new Exception("O valor deve ser maior que 0.");
            }

            this.saldo += valor;
            System.out.printf("Conta: %d\nTitular: %s\nSaldo: R$%.2f\n", this.numero, this.titular, this.saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sacar (double valor) {
        try {
            if (valor <= 0) {
                throw new Exception("O valor deve ser maior que 0.");
            }

            if (this.saldo <= 0) {
                throw new Exception("Você não possui valor suficiente para a operação.");
            }

            this.saldo -= valor + 5;
            System.out.printf("Conta: %d\nTitular: %s\nSaldo: R$%.2f\n", this.numero, this.titular, this.saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
