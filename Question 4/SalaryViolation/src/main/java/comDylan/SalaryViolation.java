package comDylan;

/**
 * Question4 - violets ADP
 * 203064690
 * Dylan Baadjies
 * TP2
 */
public class SalaryViolation extends EmployeeViolation
{
    double salary;

    public SalaryViolation(String nam, double sal)  {
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

