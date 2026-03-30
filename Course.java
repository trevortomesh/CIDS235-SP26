public class Course {
    private String courseName;
    private String[] students = new String[100];
    //private Faculty faculty;
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }


    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        // do this later
    }

    // public void setFaculty(Faculty faculty){
    //     this.faculty = faculty;
    // }
    
}
