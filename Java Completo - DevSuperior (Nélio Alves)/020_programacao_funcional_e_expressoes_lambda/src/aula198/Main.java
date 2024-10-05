package aula198;

import aula198.entities.Product;
import aula198.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).toList();
        names.forEach(System.out::println);

        list.add(new Product("Av", 900.00));
        list.add(new Product("Bablet", 350.00));
        list.add(new Product("Couse", 50.00));
        list.add(new Product("DD Case", 80.90));

        names = list.stream().map(Product::staticUpperCaseName).toList();
        names.forEach(System.out::println);

        list.add(new Product("Ev", 900.00));
        list.add(new Product("Fablet", 350.00));
        list.add(new Product("Gouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        names = list.stream().map(Product::nonStaticUpperCaseName).toList();
        names.forEach(System.out::println);

        list.add(new Product("Iv", 900.00));
        list.add(new Product("Jablet", 350.00));
        list.add(new Product("Kouse", 50.00));
        list.add(new Product("LD Case", 80.90));

        Function<Product, String> toUpperCaseName = p -> p.getName().toUpperCase();
        names = list.stream().map(toUpperCaseName).toList();
        names.forEach(System.out::println);

        list.add(new Product("Mv", 900.00));
        list.add(new Product("Nablet", 350.00));
        list.add(new Product("Oouse", 50.00));
        list.add(new Product("PD Case", 80.90));

        names = list.stream().map(p -> p.getName().toUpperCase()).toList();
        names.forEach(System.out::println);
    }
}
