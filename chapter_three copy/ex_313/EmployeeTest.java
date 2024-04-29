/*
5.Write a test app named EmployeeTest that 
demonstrates class Employee’s capabilities.
 */

import java.util.Scanner;

class EmployeeTest {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = input.nextLine();
    System.out.print("Enter your salary(monthly): ");
    Double salary = input.nextDouble();
    
    Employee newEmployee = new Employee(firstName, lastName, salary);
    
     /* If the monthly salary is not positive, do not set its value. */
    if (salary > 0) {
      newEmployee.setSalary(salary);
    } else {
      System.out.println("Salary must be positive.");
    }
    
    /*
    6. Create two Employee objects and display each object’s yearly salary.
     */
    Employee employee1 = new Employee("Aaron", "Goldstein", 10000);
    Employee employee2 = new Employee("Dominc", "Suarez", 4000);
    
    double yearlySalary1 = employee1.getSalary() * 12;
    double yearlySalary2 = employee2.getSalary() * 12;
    
    /* Give each Employee a 10% raise */
    employee1.setSalary(employee1.getSalary() * 1.1);
    employee2.setSalary(employee2.getSalary() * 1.1);
    
    System.out.printf("Yearly salary of %s after 10%% raise: %.2f\n", employee1.getFirstName(), yearlySalary1);
    System.out.printf("Yearly salary of %s after 10%% raise: %.2f\n", employee2.getFirstName(), yearlySalary2);
    }

}
