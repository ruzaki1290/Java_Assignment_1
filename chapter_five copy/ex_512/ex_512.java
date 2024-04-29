/* 
Write an application that calculates 
the product of the odd integers from 1 to 15. 
*/

// 1. Write a loop that will iterate through numbers 1 to 15 and print out only the odd ones.
// 2. Calcualte the product.
// 3. Print the result.

class productOfOdd {

  public static void main(String[] arg) {

    int sum = 0; // product
  
    // Write a loop that will iterate through numbers 1 to 15 and print out only the odd ones.
    for(int i = 1; i <= 15; i++) {
      if(i % 2 != 0) {
      // Calcualte the product.
        sum = sum + i;
      } System.out.println(sum); // Print the result.
    } // loop 
  } // main
} // productOfOdd