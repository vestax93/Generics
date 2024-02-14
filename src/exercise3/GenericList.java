package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GenericList <T>{
    private final List<T> list;

    public GenericList() {
        this.list = new ArrayList<>();
    }
    public void add(T value){
        list.add(value);
    }

    public void swap(int index1, int index2){
        checkIndex(index1); //provera da li je index u granicama liste
        checkIndex(index2);
        T element = list.get(index1); //pamcenje vrednosti elemnta koji se nalazi na poziciji index1
        this.list.set(index1,this.list.get(index2)); //upisivanje elementa sa pozicije index2 na poziciju index1
        this.list.set(index2,element); //upisivanje proslog elementa sa pozicije index1 na poziciju index2
    }
    private void checkIndex(int index){
        if(index < 0 || index >= list.size()){
            throw new IndexOutOfBoundsException("Indeks se ne nalazi u listi!");
        }
    }

    public void forEach(Consumer<T> consumer){
        for (int i = 0; i < list.size(); i++) {
            consumer.accept(list.get(i)); //poziva se izvrsenje metode za svaki element list
        }
    }

    public void printToString(){
        forEach(t -> System.out.println(t.getClass().getName() + ": " + t));
    }
}
