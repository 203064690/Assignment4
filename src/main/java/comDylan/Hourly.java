package comDylan;

/**
 * Assignment 4 - OOP principles
 * 203064690
 * Dylan Baadjies
 * TP2
 * This is an example file for inheritance & polymorphism
 */
public class Hourly extends Employee
{
    private double rate;
    private double hours;

    public Hourly(String n, double r, double hrs)  {
        super(n);
        setRate(r);
        setHours(hrs);
    }

    public void setRate(double r)  {
        rate = r;
    }
    public void setHours(double hr)  {
        hours = hr;
    }

    public double getRate()  {
        return rate;
    }
    public double getHours()  {
        return hours;
    }

    public double pay()  {
        return rate * hours;
    }

    public String toString()  {
        return super.toString() + " (rate is " + rate + " and hours are " + hours + ')';
    }
}
