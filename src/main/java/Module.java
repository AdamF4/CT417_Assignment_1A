public class Module {
    private String mName;
    private String mID;

    Module(String name, String ID){
        this.mName=name;
        this.mID=ID;
    }

    //setters
    public void setName(String name) {
        this.mName = name;
    }
    public void setID(String ID) {
        this.mID = ID;
    }

    //getters
    public String getID() {
        return mID;
    }
    public String getName() {
        return mName;
    }

}
