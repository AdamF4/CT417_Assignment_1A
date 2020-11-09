import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;

    Course(String name, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.modules= modules;
        this.startDate=startDate;
        this.endDate=endDate;
    }
}
