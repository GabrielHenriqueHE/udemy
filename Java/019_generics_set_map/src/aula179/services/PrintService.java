package aula179.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private final List<T> list = new ArrayList<>();

    public void addValue(T value) {
        this.list.add(value);
    }

    public T first() {
        if (this.list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        return list.getFirst();
    }

    public void print() {
        for (T value : this.list) {
            System.out.print(value + " ");
        }
    }
}
