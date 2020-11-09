import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private LocalDate DOB;
    private int ID;
    private String username;
    private ArrayList<Course> courses;

    Student(String name, LocalDate DOB, int ID, ArrayList<Course> courses){
        this.name=name;
        this.DOB=DOB;
        this.ID=ID;
        this.courses=courses;
    }
}
