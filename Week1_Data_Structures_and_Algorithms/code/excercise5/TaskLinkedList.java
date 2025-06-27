public class TaskLinkedList {
    private TaskNode head;

    // Add task to end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added.");
    }

    // Search task by ID
    public Task searchTask(int id) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == id) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId() == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == id) {
                current.next = current.next.next;
                System.out.println("Task deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found.");
    }
}
