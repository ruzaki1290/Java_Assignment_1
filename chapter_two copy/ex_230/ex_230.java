/* 
1.) Write an application that inputs one number consisting of five digits from the user 
2.) Separates the number into its individual digits 
3.) Prints the digits separated from one another by three spaces each 
*/

import java.util.Scanner;

class ex_230{

  /* Write an application that inputs one number consisting of five digits from the user */
  public static void main(String[] arg) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number of 5 digits please: ");
    int yourNum = input.nextInt();
    /* Separates the number into its individual digits */
    int digit1 = yourNum / 10000;
    int digit2 = (yourNum % 10000) / 1000;
    int digit3 = (yourNum % 1000) / 100;
    int digit4 = (yourNum % 100) / 10;
    int digit5 = yourNum % 10;

    /* Prints the digits separated from one another by three spaces each */
    input.close(); // Close the Scanner object to prevent resource leak
    System.out.printf("Your number of : %d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);

  }

}