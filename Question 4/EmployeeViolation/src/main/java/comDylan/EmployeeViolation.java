package comDylan;

/**
 * Question4 - violets ADP
 * 203064690
 * Dylan Baadjies
 * TP2
 */
public abstract class EmployeeViolation
{
    private String name;

    public EmployeeViolation(String name)  {
        setName(name);
    }
    public String getName()  {
        return name;
    }

    private void setName(String nm)  {
        name = nm;
    }

    public abstract double pay();

    public String toString()  {
        return "name is " + name;
    }
}
