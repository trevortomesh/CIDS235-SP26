public class StringContainer implements Container<String> {
    private String value;

    public void add(String item){
        value = item;
    }

    public String get(){
        return value;
    }
    
}
