package exercise1;

public class Box <T> {
    private final T element; //obratiti paznju na slovo

    public Box(T element) { //konstruktor kao parametar prima vrednost elementa
        this.element = element; //setuje se vrednost elementa
    }

    @Override
    public String toString() {
        return String.format("%s: %s",this.element.getClass().getName(),this.element); //
    }
}
