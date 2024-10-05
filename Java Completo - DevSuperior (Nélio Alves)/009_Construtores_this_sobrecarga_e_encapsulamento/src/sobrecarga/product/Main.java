package sobrecarga.product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        float price = sc.nextFloat();

        Product product = new Product(name, price);
        System.out.println(product.data());

    }

}
