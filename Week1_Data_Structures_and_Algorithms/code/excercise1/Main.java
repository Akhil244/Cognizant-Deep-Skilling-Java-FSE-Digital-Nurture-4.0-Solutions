import java.util.Scanner;


// Time Complexity Analysis
// Operation	Data Structure	Time Complexity
// Add Product	HashMap	O(1) (avg case)
// Update Product	HashMap	O(1) (avg case)
// Delete Product	HashMap	O(1) (avg case)
// View All	HashMap	O(n)

// Optimizations: Using HashMap ensures fast access. If sorting is needed, a TreeMap can be used instead with O(log n) operations.

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Inventory Management System ====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    inventory.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();
                    inventory.updateProduct(updateId, newQuantity, newPrice);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    String deleteId = sc.nextLine();
                    inventory.deleteProduct(deleteId);
                    break;

                case 4:
                    inventory.viewAllProducts();
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
