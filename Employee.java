public class Employee extends Person{
    public Employee(){
        this("(2) invokes employee's overloaded constructor ");
        System.out.println("(3) Performs employee tasks ");
    }

    public Employee(String s){
        System.out.println(s);
    }

}
