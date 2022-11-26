import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inventory
{
    ArrayList<Item> items;

    public Inventory()
    {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item)
    {
        this.items.add(item);
    }

    // TO-DO: Change the item being added to the list to being pushed to database
    public void updateInventory() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Inventory inv = new Inventory();
        int quit = 0;
        do{
            try{            
                System.out.print("Enter a SKU: ");
                int sku = Integer.parseInt(br.readLine());

                System.out.print("Enter a name: ");
                String name = br.readLine();

                System.out.print("Enter a description: ");
                String description = br.readLine();

                System.out.print("Enter quantity in stock: ");
                int quantity = Integer.parseInt(br.readLine());

                System.out.print("Enter price to the nearest cent: ");
                double price = Double.parseDouble(br.readLine());

                Item item = new Item(sku,name,description,quantity,price);
                inv.addItem(item);

                System.out.println("Q to quit, else continue");
                if(br.readLine().contains("Q"))
                {
                    quit = 1;
                    continue;
                }
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        while(quit == 0);
    }

    public String toString()
    {
        String out = "";
        for(int i = 0; i < items.size(); i++)
        {
            out += items.get(i).toString();
        }
        return out;
    }
}