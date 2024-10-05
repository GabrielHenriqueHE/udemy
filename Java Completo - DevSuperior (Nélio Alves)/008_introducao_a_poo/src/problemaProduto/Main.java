package problemaProduto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto: (Nome, preço e quantidade em estoque)");
        Product product = new Product(sc.next(), sc.nextDouble(), sc.nextInt());

        product.addProducts(10);
        product.removeProducts(3);

    }

}
