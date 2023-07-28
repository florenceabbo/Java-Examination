

//Question2 iii
import java.util.ArrayList;
public class Student { // created class Student
    private String name;
    private int grade;
    private ArrayList<String>courses; //  collection of courses

    public Student(String name, int grade) {
        // Initialised Student attributes
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() { // For getting initial value of class attributes
        return name;
    }

    public void setName(String name) {  // For updating initial value of class attributes to new values
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    //Method to add courses
    public void addCourses( String course){  // method to add courses to the collection courses
        courses.add(course);
    }
    //Method to remove courses
    public void removeCourses(String course){ // method to romove courses to the collection courses
        courses.remove(course);
    }
    //Method to display student Details
    public void studentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);

    }

}
