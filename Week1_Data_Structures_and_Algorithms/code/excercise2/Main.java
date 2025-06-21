import java.util.Scanner;


// What is Big O Notation?
// Big O Notation describes the upper bound of algorithm performance — how runtime or space grows with input size n.

// Search Scenarios
// Search Type	  Best Case  Average Case	 Worst Case
// Linear	        O(1)	   O(n)	         O(n)
// Binary	        O(1)	  O(log n)	    O(log n)

// Binary Search is faster but requires the array to be sorted.

// Feature	Linear Search	Binary Search
// Data Order	Unsorted	Sorted
// Time Complexity	O(n)	O(log n)
// Use Case	Small or unsorted data	Large, sorted product list

//Binary Search is more suitable for large-scale e-commerce platforms with pre-sorted product catalogs.

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shirt", "Clothing"),
            new Product("P103", "Phone", "Electronics"),
            new Product("P104", "Shoes", "Footwear"),
            new Product("P105", "Book", "Stationery")
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name to search:");
        String nameToSearch = sc.nextLine();

        System.out.println("\n--- Linear Search ---");
        Product foundLinear = SearchEngine.linearSearch(products, nameToSearch);
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Product not found.");

        System.out.println("\n--- Binary Search ---");
        Product foundBinary = SearchEngine.binarySearch(products, nameToSearch);
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Product not found.");

        sc.close();
    }
}
