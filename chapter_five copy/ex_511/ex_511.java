/* Write an application that finds the smallest of several integers. */
// 1. Prompt the user for 3 numbers.
// 2. Find out which number is the smallest.
// 2. Print out the smallest number.

import java.util.Scanner;
class smallestNumber {

  public static void main(String[] args) {
    // Prompt the user for 3 numbers.
    Scanner input = new Scanner(System.in);

      System.out.println("Enter the first number");
      int a = input.nextInt();
      System.out.println("Enter the second number");
      int b = input.nextInt();
      System.out.println("Enter the third number");
      int c = input.nextInt();
      int smallest;

      // Find out which number is the smallest.

      if (a < b && a < c) {
        smallest = a;
      } else if (b < a && b < c) {
          smallest = b;
      } else {
        smallest = c;
      }

    // Print out the smallest number.
    System.out.println("The smallest number is " + smallest);

    input.close();

  } // main

} // smallestNumber