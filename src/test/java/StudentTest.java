import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student1;
    String name;
    int age;

    Course course1;
    Course course2;
    ArrayList<Course> courses= new ArrayList<>();

    @BeforeEach
    void setUp() {
        course1 = new Course("Engineering",new ArrayList<>(),new LocalDate(2020,9,28),new LocalDate(2020,12,18));   //create sample courses
        course2 = new Course("CS&IT",new ArrayList<>(),new LocalDate(2020,9,28),new LocalDate(2020,12,18));         //create sample courses

        courses.add(course1);

        name = "Alan Turning";
        age = Years.yearsBetween(new LocalDate(1989,6,12), LocalDate.now()).getYears(); //calculate age in years
        student1 = new Student(name, new LocalDate(1989,6,12),12463728,new ArrayList<>());

    }

    @Test
    void getAge() {
        assertEquals(age,student1.getAge());
    }

    @Test
    void getUsername() {
        assertEquals(name+age,student1.getUsername());
    }

    @Test
    void addCourse(){
        student1.addCourse(course1);                    //add course1
        assertEquals(courses,student1.getCourses());    //courses (containing only course1) should now be equal to course list
    }

    @Test
    void removeCourse(){
        student1.addCourse(course1);                    //add course1
        student1.addCourse(course2);                    //add course2
        assertTrue(student1.removeCourse(course2));     //remove course 2 should return true
        assertFalse(student1.removeCourse(course2));    //remove course 2 should return false as it doesn't exist in course list
        assertEquals(courses,student1.getCourses());    //courses (containing only course1) should now be equal to course list
    }

}