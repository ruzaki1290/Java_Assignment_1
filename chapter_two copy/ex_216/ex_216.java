
/* 
1.) Write an application that asks the user to 
enter two integers. 
2.) Obtains them from the user 
and displays the larger number followed by the 
words "is larger". 
3.) If the numbers are equal, 
print the message "These numbers are equal".
*/
import java.util.Scanner;

class ex_216 {

  /* 1.) Write an application that asks the user to 
   enter two integers. */

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.printf("Enter first integer: "); // prompt
    int numberOne = input.nextInt(); // read first number from

    System.out.printf("Enter second integer: "); // prompt
    int numberTwo = input.nextInt(); // read second number from

      /*2.) Obtains them from the user 
      and displays the larger number followed by the 
      words "is larger". */

      if (numberOne > numberTwo) {
        System.out.printf("This number is larger: %d%n", numberOne);
      } else if (numberOne < numberTwo){ 
        System.out.printf("This number is larger: %d%n", numberTwo);
      } 

      /*If the numbers are equal, 
      print the message "These numbers are equal".*/

      else {
        System.out.printf("Number %d == number %d%n", numberOne, numberTwo);
      }
      
  } // end method main

} // end class ex_216