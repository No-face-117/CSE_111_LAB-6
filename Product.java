// CSE-111 LAB - 6 TASK - 1     []
// Product class

public class Product {
    private String name = "Unknown";
    private int count = 0;
    private double price = 0.0;

    public Product(){

    }

    public Product(String nk_0, double pk_0){
        name = nk_0;
        price = pk_0;
    }


    public void displayInfo() {
        System.out.println("Product Name : " + name);
        System.out.print("Price : $" + price);
    }

    public void displayInfo(boolean kar_0) {
        if (kar_0){
            System.out.println("Product Name : " + name);
            System.out.println("Price : $" + price);
            System.out.println("Quantity : " + count);

        }
    }

    public void setQuantity(int ak_0) {
        count = ak_0;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return count;
    }
}


