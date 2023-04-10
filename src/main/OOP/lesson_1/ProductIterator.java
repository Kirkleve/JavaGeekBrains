package lesson_1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductIterator implements Iterator<Product> {
    private final List<Product> products;
    private int index;
    private int fullProduct;

    public ProductIterator(List<Product> products, int fullProduct) {
        this.products = products;
        this.fullProduct = fullProduct;
    }

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();

    }

    @Override
    public Product next() throws NoSuchElementException {
        if (index >= fullProduct) {
            throw new NoSuchElementException("Очень много напитков!");
        } else if (!hasNext()) {
            return null;
        }
        return products.get(index++);
    }

}
