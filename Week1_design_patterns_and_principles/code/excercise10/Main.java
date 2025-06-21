public class Main {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Akhil", "S123", "A");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        System.out.println("\nUpdating student details...\n");

        // Update data via controller
        controller.setStudentName("Venkata Akhil");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
