package comDylan;

/**
 * Hello world!
 *
 */
public class Salary extends Employee
{
    double salary;

    public Salary(String nam, double sal)  {
        super(nam);
        setSalary(sal);
    }

    public void setSalary(double s)  {
        salary = s;
    }

    public double getSalary()  {
        return salary;
    }

    public double pay()  {
        return salary;
    }

    public String toString()  {
        return super.toString() + " (salary is " + salary + ")";
    }
}
