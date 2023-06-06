package WednesdayOfficeHours.week12.appClass;

public class App {

    private String name;
    private String version;

    //constructor
    public App( String version) {
        setName(getClass().getSimpleName());
        setVersion(version);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    //method
    public void method(){
        System.out.println(name+" is downloading version "+version);
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
