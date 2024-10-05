package problemaCotacao;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

    private static final double IOF = 0.06;

    public static void execute () {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do dólar: ");
        double price = sc.nextDouble();

        System.out.println("Insira o valor que será comprado: ");
        double amountToBought = sc.nextDouble();

        double amountToPay = CurrencyConverter.calcAmountToPay(price, amountToBought) ;

        System.out.printf("Valor total a ser pago: R$%.2f", amountToPay);
    }

    private static double calcAmountToPay (double price, double amountToBought) {

        return (amountToBought * price) + ((amountToBought * price) * IOF);

    }

}
