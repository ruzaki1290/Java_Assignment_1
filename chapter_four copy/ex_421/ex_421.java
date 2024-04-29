import java.util.Scanner;

/* Write a pseudocode program, then a Java application that inputs a
series of 10 integers and determines and prints the largest integer. 
*/

 /*
  Pseudocode program:
  1. Create a loop that increments while the counter is less or equal to 10.
  2. Create an input statement that will allow the user to input numbers using Scanner.
  3. Initialize the largest number to the smallest possible integer.
  4. Loop through all 10 input numbers and print out the largest one out of them.
  5. Print out the largest number to the user.
  */

class largestInt {

  public static void main(String[] arg) {

    // Create an input statement that will allow the user to input numbers.
    Scanner input = new Scanner(System.in);

    // Initialize the largest number to the smallest possible integer
    int largestNumber = Integer.MIN_VALUE;

    // Create a loop that increments while the counter is less or equal to 10.
    int i = 1;
    while(i <= 10) {
        System.out.println("Enter your number: ");
        int userNumber = input.nextInt();

        // If the entered number is larger than the current largest number, update the largest number.
        if (userNumber > largestNumber) {
          largestNumber = userNumber;
        }
        
      i++;
    } // loop

    // 5. Print out the largest number to the user.
    System.out.println("The largest number is: " + largestNumber);

  } // main
} // largestInt
  