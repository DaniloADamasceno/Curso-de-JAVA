package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<TypeGenerics> {

    List<TypeGenerics> list = new ArrayList<>();

    public void addValue(TypeGenerics value) {
        list.add(value);
    }

    public TypeGenerics first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty || Lista está vazia");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
