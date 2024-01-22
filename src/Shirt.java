public class Shirt {
    public int shirtID = 42;
    public String description = "Just a shirt that answers the questions of life, the universe and all that";
    public String colorCode = "Red";
    public double price = 42.0;
    public int quantityInStock = 1;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
