public class GenericContainer<T> implements Container<T>{
    private T value;

    public void add(T item){
        value = item;
    }

    public T get(){
        return value;
    }

    public <U> void printTwice(U item){
        System.out.println(item);
        System.out.println(item);
    }
    
}
