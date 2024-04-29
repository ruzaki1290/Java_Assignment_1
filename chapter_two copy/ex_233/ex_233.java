/*
1.) Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters) 
2.) Then calculates the user’s body mass index
3.) Displays BMI result
4.) Displays BMI category
*/

import java.util.Scanner;

class ex_233 {

    // Create a BMI calculator that reads the user’s weight in kilograms and height in centimeters
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        // Print weight
        System.out.println("Enter your weight(kg): ");
        double inputWeight = input.nextDouble();

        // Print height
        System.out.println("Enter your height(cm): ");
        double inputHeight = input.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = inputHeight / 100.0;

        // Displays BMI result
        double bmi = calculateBMI(inputWeight, heightInMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Displays BMI category
        System.out.println(getBMICategory(bmi));

    }

    // Then calculates the user’s body mass index
    public static double calculateBMI(double inputWeight, double heightInMeters) {
        return inputWeight / (heightInMeters * heightInMeters);
    }

    // Creates category of BMI result
    public static String getBMICategory(double bmi) {
      if (bmi < 18.5) {
        return "Underweight";
      } else if (bmi>=18.5 && bmi<25) {
        return "Normal weight";
      } else if (bmi>=25 && bmi<30) {
        return"Overweight";
      }else{
        return"Obese";
      }
      
    } // end main

} // end class ex_233
