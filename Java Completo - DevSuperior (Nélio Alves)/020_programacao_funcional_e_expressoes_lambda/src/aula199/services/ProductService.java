package aula199.services;

import aula199.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> products, Predicate<Product> predicate) {
        double sum = 0.0;
        for (Product p : products) {
            if (predicate.test(p)) {
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
