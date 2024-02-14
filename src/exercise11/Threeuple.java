package exercise11;

public class Threeuple <K, V, V2> {
    private K key;
    private V value;
    private V2 value2;

    public Threeuple(K key, V value, V2 value2) {
        this.key = key;
        this.value = value;
        this.value2 = value2;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return this.key + " -> " + this.value + " -> " + this.value2;
    }
}
