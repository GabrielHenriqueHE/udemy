package aula193;

import aula193.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Comparator<Product> comparator = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());

        // list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));
        list.sort(Comparator.comparing(o -> o.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
