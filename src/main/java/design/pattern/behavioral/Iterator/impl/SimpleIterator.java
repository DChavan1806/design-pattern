package design.pattern.behavioral.Iterator.impl;

import java.util.List;
import java.util.ArrayList;

public class SimpleIterator<T> {
    private List<T> collection;
    private int index = -1;


    public SimpleIterator(List<T> collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return index + 1 < collection.size();
    }

    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        index++;
        return collection.get(index);
    }

    // remove() removes the last element returned by next()
    public void remove() {
        if (index < 0) {
            throw new IllegalStateException("No element to remove.");
        }
        collection.remove(index);
        index--;  // Adjust the index after removal
    }

    public static void main(String[] args) {
        // Sample collection (ArrayList of Integers)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        SimpleIterator<Integer> iterator = new SimpleIterator<>(numbers);


        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println("Iterating element: " + i);
            if (i == 1) {
                iterator.remove();  // Remove the element if it equals 1
                System.out.println("Element 1 removed");
            }
        }

        // Print the remaining elements
        System.out.println("Remaining elements in the collection: " + numbers);
    }
}
