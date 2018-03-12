package comDylan;

/**
 * Question4 - violets ADP
 * 203064690
 * Dylan Baadjies
 * TP2
 */
public class mainPolyViolation
{
    public static final int MAX_EMPLOYEES = 10;

    public static double payIncrease(EmployeeViolation emp, double amt){
        return amt += emp.pay();
    }

    public static void main(String[] args)  {
        EmployeeViolation[] employees = new EmployeeViolation[MAX_EMPLOYEES];

        int emp = 0;
        employees[emp++] = new hourlyViolation("George Jones", 75.00, 2.5);
        employees[emp++] = new SalaryViolation("Dolly Parton", 125.00);
        employees[emp++] = new hourlyViolation("Willie Nelson", 85.00, 3.0);
        employees[emp++] = new SalaryViolation("Jim Reeves", 150.00);
        employees[emp++] = new hourlyViolation("Tammy Wynette", 65.00, 2.0);

        for (int i = 0; i < emp; ++i)  {
            System.out.println("employee:  " + employees[i]);
            System.out.println("pay:  " + employees[i].pay());
            System.out.println();
        }


        EmployeeViolation emp1 = new hourlyViolation("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee "+ emp1.getName()+ " new salary:R"+mainPolyViolation.payIncrease(emp1, 100));
    }

}
