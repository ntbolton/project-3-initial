package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    private List<T> bagList;

    public Bag() {
        this.bagList = new ArrayList<T>();

    }

    @Override
    public boolean isEmpty() {
        return this.bagList.isEmpty();
    }

    @Override
    public int size() {
        return this.bagList.size();
    }

    @Override
    public void add(T item) {
        bagList.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return bagList.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }


}
