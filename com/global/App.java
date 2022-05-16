package global;

class Store<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

public class App {
    public static void main(String[] args) {
        Store<Integer> store = new Store<>();
        store.setItem(34);
        Integer item = store.getItem();
        System.out.println(item);
    }
}