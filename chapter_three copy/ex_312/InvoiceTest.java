package ex_312;

import java.util.Scanner;
/* 
Write a test app named InvoiceTest that demonstrates 
class Invoice’s capabilities.
 */
class InvoiceTest {

public static void main(String[] args) {
  
Scanner input = new Scanner(System.in);

System.out.print(" Enter item number: ");
String partNum = input.nextLine();
System.out.print("Enter item description: " );
String partDescript = input.nextLine();
System.out.print("Enter quantity: " );
int quantity = input.nextInt();
System.out.print("Enter price per item: " );
double pricePerItem = input.nextDouble();

Invoice Invoice_1 = new Invoice(partNum, partDescript, quantity, pricePerItem);

System.out.printf("Your invoice amount is: %.2f\n", Invoice_1.getInvoiceAmount());

input.close();
}

}