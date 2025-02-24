public class PizzaStore {

    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;

    private String storeMenu;
    private String pizzaIngredients;
    private double pizzaPrice;
    private String sides;
    private String drinks;
    private String orderID;
    private double orderTotal;

    public void takeOrder(String id, String ingredients, String sides, String drinks, double total) {
        orderID = id;
        pizzaIngredients = ingredients;
        this.sides = sides;
        this.drinks = drinks;
        orderTotal = total;

        System.out.println("Order accepted!");
        System.out.println("Order is being processed...");

        makePizza();
    }

    private void makePizza() {
        System.out.println("Making your pizza with the following ingredients: " + pizzaIngredients);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Pizza is ready!");
        }

        System.out.println("Your pizza is ready!");
        System.out.println("Preparing your sides: " + sides);
        System.out.println("Preparing your drinks: " + drinks);

        printReceipt();
    }

    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Sides: " + sides);
        System.out.println("Drinks: " + drinks);
        System.out.println("Order Total: $" + orderTotal);
        System.out.println("Thank you for choosing " + storeName + "!");
    }


    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.storeName = "Delicious Pizza";
        pizzaStore.storeAddress = "123 Pizza Street, Pizza City";
        pizzaStore.storeEmail = "info@deliciouspizza.com";
        pizzaStore.storePhone = 1234567890;

        pizzaStore.takeOrder("001", "Pepperoni, Cheese", "Garlic Bread", "Coca-Cola", 25.99);
    }
}