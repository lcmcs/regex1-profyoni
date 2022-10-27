package edu.touro.cs.mcon364;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List<String>, Iterable<String> {
    private String[] backingStore = new String[10];
    private int ip = 0; // insertionPoint

    public MyArrayList()
    {
    }

    public MyArrayList(int initialCapacity)
    {
        backingStore = new String[initialCapacity];
    }

    @Override
    public int size() {
        return ip;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyArrayListIterator();
    }

    // private classes may only be declared (defined) within another class
    // inner class = class in an (outer) class
    // accessible only in outer class
    // designed so that the inner class is self-contained, yet has access to outer class
    // Principle of Least Privilege = grant as little access as possible - as much as needed
    private class MyArrayListIterator implements Iterator<String> { // inner class
        private int preIndex = 0;

        @Override
        public boolean hasNext() {
            return this.preIndex < MyArrayList.this.ip;
        }

        @Override
        public String next() {
            return MyArrayList.this.backingStore[this.preIndex++];
        }

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        if (ip >= backingStore.length)
            growBackingStore();

        backingStore[ip] = s;
        ip++;

        return true;
    }

    private void growBackingStore() {
        String[] newBs = new String[2 * backingStore.length + 1];
        System.arraycopy(backingStore, 0, newBs, 0, backingStore.length);
        backingStore = newBs;

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        if (c.size() == 0) // quick and dirty approach - not recommended
            return false;

        for (String s : c) {
            add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= ip)
            throw new IndexOutOfBoundsException(
                    String.format("size is %d, Index used was %d",  size(), index));
        return backingStore[index];
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }


}


