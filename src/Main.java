public class Main {
    public static void main(String[] args) {

        final double SALES_TAX_PERCENT = 0.05; // 5% tax used to compute itemTax
        double itemPrice;     // for base price of item (user input)
        double itemTax;       // stores the tax to be placed on the item
        double itemTotal;     // the price of the item + tax

        System.out.println("Enter price:");
        itemPrice = 4.39;       //simulate user input
        System.out.println("You entered: $" + itemPrice); // for test runs

        itemTax = itemPrice * SALES_TAX_PERCENT; // calculating tax
        itemTotal = itemPrice * itemTax;      // adding tax to base price

        System.out.println("Sales tax: $" + itemTax + "\n" +
                "Your total is: $" + itemTotal);        // tells user tax amount and total

        // end
    }
}