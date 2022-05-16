package global;

import java.nio.channels.GatheringByteChannel;

class Store<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}


class HashTable<K,V>{
    private K key;
    private V value;

    public HashTable(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return "Hashtable [key="+key+",value="+value+"]";
    }
}


public class MultipleGenericsType {
    public static void main(String[] args) {
        HashTable <String,Integer> hash;
        hash = new HashTable("Hello", 23);

        hash.toString();
        
    }
}