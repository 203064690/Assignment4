package comDylan;

/**
 * Assignment 4 - OOP principles
 * 203064690
 * Dylan Baadjies
 * TP2
 * This is an example file for Encapsulation
 */
public class Poly {
    public static final int MAX_EMPLOYEES = 10;

    public static double payIncrease(Employee emp, double amt) {
        return amt += emp.pay();
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[MAX_EMPLOYEES];

        int emp = 0;

        employees[emp++] = new Hourly("George Jones", 75.00, 2.5);
       //employees[emp++] = new Salaried("Dolly Parton", 125.00);
        employees[emp++] = new Hourly("Willie Nelson", 85.00, 3.0);
      //  employees[emp++] = new Salaried("Jim Reeves", 150.00);
        employees[emp++] = new Hourly("Tammy Wynette", 65.00, 2.0);

        for (int i = 0; i < emp; ++i) {
            System.out.println("employee:  " + employees[i]);
            System.out.println("pay:  " + employees[i].pay());
            System.out.println();
        }

        //Encapsulation
        Employee emp1 = new Hourly("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee " + emp1.getName() + " new salary:R" + Poly.payIncrease(emp1, 100));

        //Composition
        EmployeeComposition obj = new EmployeeComposition("Dylan Baadjies");
        Salaried theSalary = new Salaried(obj, 75);
        System.out.println("Employee " + obj.getName() + " new salary:R" + Poly.payIncrease(emp1, 100));
    }

}