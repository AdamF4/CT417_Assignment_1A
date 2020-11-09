import org.joda.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course1;

    Module module1;
    Module module2;
    ArrayList<Module> modules= new ArrayList<>();

    @BeforeEach
    void setUp() {
        module1 = new Module("Chemistry","CH111");  //create sample module1
        module2 = new Module("Physics","PY222");    //create sample module2

        modules.add(module1);

        course1 = new Course("Science", new ArrayList<>(),new LocalDate(2020,9,28),new LocalDate(2020,12,18));
    }

    @Test
    void addModule() {
        course1.addModule(module1);                     //add module1
        assertEquals(modules,course1.getModules());     //modules (only containing module1) should now be equal to module list
    }

    @Test
    void removeModule() {
        course1.addModule(module1);    //add module1
        course1.addModule(module2);    //add module2
        assertTrue(course1.removeModule(module2));     //remove module 2 should return true
        assertFalse(course1.removeModule(module2));    //remove module 2 should return false as it doesn't exist in module list
        assertEquals(modules,course1.getModules());    //modules (containing only module1) should now be equal to module list
    }

}