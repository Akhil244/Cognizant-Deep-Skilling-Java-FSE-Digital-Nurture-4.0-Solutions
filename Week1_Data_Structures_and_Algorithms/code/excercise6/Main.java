import java.util.Scanner;


//  Linear vs Binary Search
// Algorithm	Best Case	Average Case	Worst Case	Requirement
// Linear	O(1)	O(n)	O(n)	Works on unsorted
// Binary	O(1)	O(log n)	O(log n)	Requires sorted list

// When to Use Which Search?
// Scenario	Best Search
// Small, unsorted data	Linear Search
// Large, sorted dataset	Binary Search
// Real-time dynamic inserts	Linear (or use Tree/Hash Map)



public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "The Alchemist", "Paulo Coelho"),
            new Book(102, "To Kill a Mockingbird", "Harper Lee"),
            new Book(103, "1984", "George Orwell"),
            new Book(104, "The Hobbit", "J.R.R. Tolkien"),
            new Book(105, "A Brief History of Time", "Stephen Hawking")
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Available books:");
        Library.displayBooks(books);

        System.out.print("\nEnter book title to search: ");
        String searchTitle = sc.nextLine();

        // Linear Search
        System.out.println("\n-- Linear Search --");
        Book resultLinear = Library.linearSearch(books, searchTitle);
        System.out.println(resultLinear != null ? "Found: " + resultLinear : "Book not found.");

        // Binary Search
        System.out.println("\n-- Binary Search --");
        Book resultBinary = Library.binarySearch(books, searchTitle);
        System.out.println(resultBinary != null ? "Found: " + resultBinary : "Book not found.");

        sc.close();
    }
}
