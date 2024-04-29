package ex_312;

/* 
1.) Create a class called Invoice that a hardware store might use to represent
 an invoice for an item sold at the store. 
2.) An Invoice should include four pieces of information as instance variables: 
 a part number (type String), a part description (type String), a quantity of the 
 item being purchased (type int) and a price per item (double). 
3.) Your class should have a constructor that initializes the four instance variables. Provide a set 
  and a get method for each instance variable. 
4.) In addition, provide a method named getInvoiceAmount that calculates the invoice 
  amount (i.e., multiplies the quantity by the price per item), then returns 
  the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per 
  item is not positive, it should be set to 0.0. 
5.) Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities. 
  */

/* Create a class called Invoice that a hardware store might use to represent
 an invoice for an item sold at the store. 
 An Invoice should include four pieces of information as instance variables: 
 a part number (type String), a part description (type String), a quantity of the 
 item being purchased (type int) and a price per item (double). 
 */
public class Invoice {
  private String partNum;
  private String partDescript;
  private int quantity;
  private double pricePerItem;

  /* Your class should have a constructor that initializes the four instance variables. */
    public Invoice(String partNum, String partDescript, int quantity, double pricePerItem) {
      this.partNum = partNum;
      this.partDescript = partDescript;
      this.quantity = quantity;
      this.pricePerItem = pricePerItem;
    } 

      /* In addition, provide a method named getInvoiceAmount that calculates the invoice 
    amount (i.e., multiplies the quantity by the price per item), then returns 
    the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per 
    item is not positive, it should be set to 0.0. */
    public double getInvoiceAmount() {
      if (this.quantity < 0) {
          this.quantity = 0;
      }
      if (this.pricePerItem < 0.0) {
          this.pricePerItem = 0.0;
      }
      return this.quantity * this.pricePerItem;
  }

    /* Provide a set and a get method for each instance variable. */

    // Getters
      public String getPartNum() {
        return partNum;
      }

      public String getPartDescript() {
        return partDescript;
      }

      public int getQuantity() {
        return quantity;
      }

      public double getPricePerItem() {
        return pricePerItem;
      }

      // Setters
      public void setPartNum(String partNum) {
        this.partNum = partNum;
      }

      public void setPartDescript(String partDescript) {
        this.partDescript = partDescript;
      }

      public void setQuantity(int quantity) {
        this.quantity = quantity;
      }

      public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
      }

} // public Invoice class