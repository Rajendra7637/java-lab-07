import java.util.Stack;

public class Q08_StackCustomTaskManagement {
    // Custom Task class
    static class Task {
        private int taskId;
        private String description;

        public Task(int taskId, String description) {
            this.taskId = taskId;
            this.description = description;
        }

        public int getTaskId() {
            return taskId;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Task #" + taskId + ": " + description;
        }
    }

    private final Stack<Task> taskStack = new Stack<>();

    public void pushTask(Task task) {
        taskStack.push(task);
        System.out.println("Pushed -> " + task);
    }

    public void popCompletedTask() {
        if (!taskStack.isEmpty()) {
            Task completed = taskStack.pop();
            System.out.println("Popped (Completed) -> " + completed);
        } else {
            System.out.println("No tasks to pop. Stack is empty.");
        }
    }

    public void displayRemainingTasks() {
        System.out.println("\n--- Remaining Tasks in Stack (Top to Bottom) ---");
        if (taskStack.isEmpty()) {
            System.out.println("No tasks pending.");
            return;
        }
        for (int i = taskStack.size() - 1; i >= 0; i--) {
            System.out.println("  [" + (taskStack.size() - i) + "] " + taskStack.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q08: Stack Task Management Simulator ===");
        Q08_StackCustomTaskManagement manager = new Q08_StackCustomTaskManagement();

        manager.pushTask(new Task(101, "Setup Project Repository"));
        manager.pushTask(new Task(102, "Implement Database Models"));
        manager.pushTask(new Task(103, "Design User Interface"));
        manager.pushTask(new Task(104, "Run Integration Tests"));

        manager.displayRemainingTasks();

        System.out.println("\nCompleting latest tasks (LIFO order):");
        manager.popCompletedTask();
        manager.popCompletedTask();

        manager.displayRemainingTasks();
    }
}
