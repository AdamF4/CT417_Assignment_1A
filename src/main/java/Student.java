import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {
    private String name;
    private LocalDate DOB;
    private int ID;
    private ArrayList<Course> courses;

    Student(String name, LocalDate DOB, int ID, ArrayList<Course> courses){
        this.name=name;
        this.DOB=DOB;
        this.ID=ID;
        this.courses=courses;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    //getters
    public String getName() {
        return name;
    }
    public LocalDate getDOB() {
        return DOB;
    }
    public int getID(){
        return ID;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //Calculate and return age with DOB and current date
    public int getAge() {
        return Years.yearsBetween(DOB, LocalDate.now()).getYears();
    }
    //Create and return username with name and age
    public String getUsername() {
        return getName() + getAge();
    }

    //mutators
    public void addCourse(Course course){
        courses.add(course);
    }
    public boolean removeCourse(Course course){
        return courses.remove(course);
    }

}
