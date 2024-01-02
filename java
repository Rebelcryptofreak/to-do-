import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        String task = tasks.get(index);
        tasks.remove(index);
        System.out.println("Task removed: " + task);
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (add, remove, display, quit):");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Enter a task:");
                String task = scanner.nextLine();
                toDoList.addTask(task);
            } else if (command.equals("remove")) {
                System.out.println("Enter the index of the task to remove:");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                toDoList.removeTask(index);
            } else if (command.equals("display")) {
                toDoList.displayTasks();
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
