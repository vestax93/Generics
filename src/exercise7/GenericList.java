package exercise7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class GenericList <T extends Comparable<T>> {
    private List<T> list;

    public GenericList() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public void swap(int index1, int index2) {
        checkIndex(index1); //provera da li je index u granicama liste
        checkIndex(index2);
        T element = list.get(index1); //pamcenje vrednosti elemnta koji se nalazi na poziciji index1
        this.list.set(index1, this.list.get(index2)); //upisivanje elementa sa pozicije index2 na poziciju index1
        this.list.set(index2, element); //upisivanje proslog elementa sa pozicije index1 na poziciju index2
    }


    public T remove(int index) {
        checkIndex(index);
        T element = list.get(index);
        list.remove(index);
        return element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Indeks se ne nalazi u listi!");
        }
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < list.size(); i++) {
            consumer.accept(list.get(i)); //poziva se izvrsenje metode za svaki element list
        }
    }

    public void printToString() {
        forEach(t -> System.out.println(t));
    }

    public int sumOfGreater(T element) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (element.compareTo(list.get(i)) < 0) { //element liste je veci od elementa zadatog
                counter++;
            }
        }
        return counter;
    }

    public T getMin() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Lista je prazna, nema minimuma.");
        }
        T min = this.list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) { //ako nadje element manji od minimuma taj element postaje minimum
                min = list.get(i);
            }
        }
        return min;
    }

    public T getMax() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Lista je prazna, nema maksimuma.");
        }
        T max = this.list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) { //ako nadje element veci od maximuma
                max = list.get(i);
            }
        }
        return max;
    }

    public T get(int index) {   //uzima element iz liste i vraca ga
        return this.list.get(index);
    }

    public int size() { // vraca velicinu lsite
        return this.list.size();
    }

}
