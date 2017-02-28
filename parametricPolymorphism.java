/*

Esther Hwang
02-28 Polymetric Polymorphism Reading Exercise

*/

public class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public T setValue(T value) {
        this.value = value;
    }
}
