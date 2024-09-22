package aula197;

import aula197.entities.Product;
import aula197.util.PriceUpdater;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        list.forEach(x -> x.setPrice(x.getPrice() * 1.1));
        list.forEach(System.out::println);
        System.out.println();

        Consumer<Product> priceUpdater = x -> x.setPrice(x.getPrice() * 1.1);
        list.forEach(priceUpdater);
        list.forEach(System.out::println);
        System.out.println();

        list.forEach(new PriceUpdater());
        list.forEach(System.out::println);
        System.out.println();

        list.forEach(Main::priceUpdater);
        list.forEach(System.out::println);
        System.out.println();

        list.forEach(Product::staticPriceUpdater);
        list.forEach(System.out::println);
        System.out.println();

        list.forEach(Product::nonStaticPriceUpdater);
        list.forEach(System.out::println);
        System.out.println();

    }

    public static void priceUpdater(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
