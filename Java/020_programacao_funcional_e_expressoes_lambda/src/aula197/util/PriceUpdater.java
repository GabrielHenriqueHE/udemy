package aula197.util;

import aula197.entities.Product;

import java.util.function.Consumer;

public class PriceUpdater implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
