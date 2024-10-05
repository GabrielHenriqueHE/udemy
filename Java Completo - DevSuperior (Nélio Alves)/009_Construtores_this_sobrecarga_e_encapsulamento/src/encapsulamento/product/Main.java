package encapsulamento.product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product("TV", 900.00);


        System.out.println(product.getPrice());
        product.setPrice(899.99);
        System.out.println(product.getPrice());

    }
}
