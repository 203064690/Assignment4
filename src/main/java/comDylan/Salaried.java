package comDylan;

/**
 * Assignment 4 - OOP principles
 * 203064690
 * Dylan Baadjies
 * TP2
 * This is an example file for Composition & polymorphism
 */
public class Salaried
{
    double salary;
    EmployeeComposition name1;

    public Salaried(EmployeeComposition nam, double sal)  {
        this.name1 = nam;
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
