public class Student extends Person {
    private Course[] courseList;
    private Name name = new Name();
    private Address[] addressList;

    public void addCourse(Course c){
        // add course here...
    }

    public void setName(String first, String last){
        name.first = first;
        name.last = last; 
    }

    public String getName(){
        //String fullName = first + " " + last; 
        return name.first + " " + name.last;
    }

    @Override
    public String toString(){
        return "Student";
    }

}
