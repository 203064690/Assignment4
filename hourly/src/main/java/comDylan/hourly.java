package comDylan;

/**
 * Hello world!
 *
 */
public class hourly extends Employee
{
    private double rate;
    private double hours;

    public hourly(String n, double r, double hrs)  {
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
