package comDylan;

/**
 * Created by dylanb on 12/03/2018.
 */
public class EmployeeComposition {
    private String name;

    public EmployeeComposition(String name)  {
        setName(name);
    }
    public String getName()  {
        return name;
    }

    private void setName(String nm)  {
        name = nm;
    }

    public String toString()  {
        return "name is " + name;
    }
}
