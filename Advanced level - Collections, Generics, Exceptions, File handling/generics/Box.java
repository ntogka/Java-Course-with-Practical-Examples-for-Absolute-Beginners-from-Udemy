package advanced.generics;

public class Box<T> {

    private T typeDate;

    public void setTypeDate(T typeDate) {
        this.typeDate = typeDate;
    }

    public T getTypeDate() {
        return typeDate;
    }

    @Override
    public String toString() {
        return "Box{" +
                "typeDate=" + typeDate +
                '}';
    }
}
