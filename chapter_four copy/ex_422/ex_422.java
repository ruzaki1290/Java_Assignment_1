/* Write a Java application that uses 
looping to print the table of values */

/*  
 1. Create three rows of N*10, N*100, N*1000.
 2. Create a loop that will increment a row of numbers from 1 till 5 and give value to N.
 3. Write a print statement to print the results.
*/

class tableOfValues {

  public static void main(String[] args) {

    // Create three rows of N*10, N*100, N*1000.
  System.out.println("N\tN*10\tN*100\tN*1000"); 

    // Create a loop that will increment a row of numbers from 1 till 5 and give value to N.
      for(int N = 1; N <= 5; N = N + 1) {

        int n_10 = 10 * N;
        int n_100 = 100 * N;
        int n_1000 = 1000 * N;

        // Write a print statement to print the results.
        System.out.println(N + "\t" + n_10 + "\t" + n_100 +"\t" + n_1000);
    }
    
  }

}