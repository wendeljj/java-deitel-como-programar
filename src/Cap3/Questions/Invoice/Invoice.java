package Cap3.Questions.Invoice;

public class Invoice
{
    private String number;
    private String description;
    private int qtyItem;
    private double priceItem;

    public Invoice(String number, String description,
                   int qtyItem, double priceItem)
    {
        this.number = number;
        this.description = description;
        if(qtyItem >= 0)
            this.qtyItem = qtyItem;
        if(priceItem >= 0.0)
            this.priceItem = priceItem;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setQtyItem(int qtyItem)
    {
        this.qtyItem = qtyItem;
    }

    public int getQtyItem()
    {
        return qtyItem;
    }

    public void setPriceItem(double priceItem)
    {
        this.priceItem = priceItem;
    }

    public double getPriceItem()
    {
        return priceItem;
    }

    public double getInvoiceAmount(int qtyItem, double priceItem)
    {
        double invoiceAmount = 0.0;
        if (qtyItem * priceItem >= 0.0)
             invoiceAmount = qtyItem * priceItem;
        return invoiceAmount;
    }
}
