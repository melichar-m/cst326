public class Item
{
    private int sku;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Item()
    {
        this.sku = 12345;
        this.name = "";
        this.description = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Item(int sku, String name, String description, int quantity, double price)
    {
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getSku()
    {
        return this.sku;
    }
    public void setSku(int sku)
    {
        this.sku = sku;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String toString()
    {
        String out = "";
        out += "SKU: " + this.sku + "\n" + 
                "Name: " + this.name + "\n" +
                "Description: " + this.description + "\n" +
                "Quantity: " + this.quantity + "\n" +
                "Price: " + this.price + "\n";
        return out;
    }
}