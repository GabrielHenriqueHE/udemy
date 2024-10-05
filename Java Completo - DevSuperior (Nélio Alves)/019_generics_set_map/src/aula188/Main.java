package aula188;

import aula188.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.00);
        stock.put(p2, 20000.00);
        stock.put(p3, 15000.00);

        Product ps = new Product("TV", 900.00);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
