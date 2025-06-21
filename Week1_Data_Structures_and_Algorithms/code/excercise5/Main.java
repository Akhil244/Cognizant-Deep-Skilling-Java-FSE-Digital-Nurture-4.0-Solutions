import java.util.Scanner;


// Types of Linked Lists
// Type	Description
// Singly Linked List	Each node points to next node only.
// Doubly Linked List	Each node points to both previous and next node.

// Singly Linked List is used here for simplicity and memory efficiency.

// Time Complexity Analysis
// Operation	Time Complexity	Notes
// Add Task	O(n)	Insert at end (can be O(1) with tail)
// Search Task	O(n)	Linear traversal by ID
// Traverse	O(n)	Visit all nodes
// Delete Task	O(n)	Must find the node

// Advantages of Linked Lists over Arrays
// Dynamic size: No need to define fixed size at creation.

// Efficient Insertions/Deletions: O(1) if pointer is known.

// No shifting required like arrays after deletion.




public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Task Management System ===");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = sc.nextLine();
                    taskList.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int searchId = sc.nextInt();
                    Task found = taskList.searchTask(searchId);
                    System.out.println(found != null ? found : "Task not found.");
                    break;

                case 3:
                    taskList.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    taskList.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
