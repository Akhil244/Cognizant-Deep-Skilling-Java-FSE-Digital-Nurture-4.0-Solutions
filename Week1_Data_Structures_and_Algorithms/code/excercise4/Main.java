import java.util.Scanner;

// Array Representation in Memory
// Arrays are stored in contiguous memory locations.

// Fast access via index (O(1)), since the memory address of any element can be directly calculated.

// Time Complexity Analysis
// Operation	Time Complexity	Notes
// Add Employee	O(1)	Just add at end
// Search	O(n)	Linear search by ID
// Traverse	O(n)	Print all records
// Delete	O(n)	Shift elements after deletion

// Limitations of Arrays
// Fixed size: Can't dynamically grow beyond initial capacity.

// Inefficient deletions: Requires shifting elements.

// Better Alternatives: Use ArrayList or HashMap for real-world applications.




public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. List All Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    manager.addEmployee(new Employee(id, name, position, salary));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    Employee found = manager.searchEmployee(searchId);
                    System.out.println(found != null ? found : "Employee not found.");
                    break;

                case 3:
                    manager.listAllEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
