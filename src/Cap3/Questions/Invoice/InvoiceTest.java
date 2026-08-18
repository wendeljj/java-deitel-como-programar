package Cap3.Questions.Invoice;

import java.util.Scanner;

public class InvoiceTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int qtyItem = 7;
        double priceItem = 4.2;

        Invoice invoice1 = new Invoice("001",
                "Bucha vegetal", qtyItem, priceItem);

        System.out.printf("invoice1%ninvoice number: %s%ninvoice description: %s%ninvoice qty: %d%ninvoice price: %.2f%ninvoice amount: %.2f%n",
                invoice1.getNumber(),invoice1.getDescription(), invoice1.getQtyItem(), invoice1.getPriceItem(),invoice1.getInvoiceAmount(qtyItem, priceItem));
    }
}
