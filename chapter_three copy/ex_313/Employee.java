/*
 1.) Create a class called Employee that includes
    three instance variables—a first name (type String), 
    a last name (type String) and a monthly salary (double). 
 2.) Provide a constructor that initializes the three instance variables.
 3.) Provide a set and a get method for each instance variable. 
 4.) If the monthly salary is not positive, do not set its value. 
 5.) Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
 6.) Create two Employee objects and display each object’s yearly salary. 
 7.) Then give each Employee a 10% raise and display each Employee’s yearly salary again. 
 */

  /* 1.Create a class called Employee that includes
    three instance variables—a first name (type String), 
    a last name (type String) and a monthly salary (double). */
    public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

  /* Provide a constructor that initializes the three instance variables. */
  public Employee(String firstName, String lastName, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  } // constructor

  /* Provide a set and a get method for each instance variable. */

  //Getters
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }

  public double getSalary() {
    return salary;
  }

  //Setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

} // public class Employee