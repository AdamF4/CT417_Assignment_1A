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

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    //getters
    public String getName() {
        return name;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    //mutators
    public boolean removeModule(Module module){
        return modules.remove(module);
    }
    public void addModule(Module module){
        modules.add(module);
    }

}
