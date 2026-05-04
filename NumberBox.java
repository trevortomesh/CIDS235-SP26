public class NumberBox<T extends Number>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public double doubleValue(){
        return value.doubleValue();
    }
}
