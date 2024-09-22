package aula196;

import aula196.entities.Product;
import aula196.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(x -> x.getPrice() >= 100);

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));

        Predicate<Product> removeIf = x -> x.getPrice() >= 100;
        list.removeIf(removeIf);

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));

        list.removeIf(Main::removeIf);

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));

        list.removeIf(new ProductPredicate());

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));

        list.removeIf(Product::staticProductPredicate);

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));

        list.removeIf(Product::nonStatictProductPredicate);

        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static boolean removeIf(Product x) {
        return x.getPrice() >= 100;
    }
}
