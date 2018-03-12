package comDylan;

/**
 * Hello world!
 *
 */
public class mainPoly
{
    public static final int MAX_EMPLOYEES = 10;

    public static double payIncrease(Employee emp, double amt){
        return amt += emp.pay();
    }

    public static void main(String[] args)  {
        Employee[] employees = new Employee[MAX_EMPLOYEES];

        int emp = 0;
        employees[emp++] = new hourly("George Jones", 75.00, 2.5);
        employees[emp++] = new Salary("Dolly Parton", 125.00);
        employees[emp++] = new hourly("Willie Nelson", 85.00, 3.0);
        employees[emp++] = new Salary("Jim Reeves", 150.00);
        employees[emp++] = new hourly("Tammy Wynette", 65.00, 2.0);

        for (int i = 0; i < emp; ++i)  {
            System.out.println("employee:  " + employees[i]);
            System.out.println("pay:  " + employees[i].pay());
            System.out.println();
        }


        Employee emp1 = new hourly("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee "+ emp1.getName()+ " new salary:R"+mainPoly.payIncrease(emp1, 100));
    }
}
