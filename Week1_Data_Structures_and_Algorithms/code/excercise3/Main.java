public class Main {

//Sorting Algorithms 
// Algorithm	Best Case	Average Case	Worst Case	Space	Stable
// Bubble Sort	O(n)	      O(n²)     	O(n²)	   O(1)	     Yes
// Quick Sort	O(n log n)	  O(n log n)	O(n²)	  O(log n)	 No

// Why Quick Sort is Preferred Over Bubble Sort:
// Speed: Quick Sort is much faster on average, especially for large datasets.

// Divide and Conquer: It uses a recursive approach to sort parts of the array independently.

// Bubble Sort is simple but extremely inefficient for real-world data (quadratic time).


    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 2500.50),
            new Order("O102", "Bob", 1500.00),
            new Order("O103", "Charlie", 3200.75),
            new Order("O104", "David", 800.99),
            new Order("O105", "Eva", 2200.00)
        };

        System.out.println("Original Orders:");
        Sorter.printOrders(orders);

        // Bubble Sort
        Order[] bubble = orders.clone();
        Sorter.bubbleSort(bubble);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        Sorter.printOrders(bubble);

        // Quick Sort
        Order[] quick = orders.clone();
        Sorter.quickSort(quick, 0, quick.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        Sorter.printOrders(quick);
    }
}
