package vetores.parte2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] produtos = new Product[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double price = sc.nextDouble();

            produtos[i] = new Product(name, price);
        }

        double total = 0;

        for (int i = 0; i < produtos.length; i++) {
            total += produtos[i].price;
        }

        System.out.printf("Média dos valores dos produtos: R$%.2f", total / produtos.length);

    }
}
