package oop.arrays_example.mini_project;

import java.util.ArrayList;

public class TodoService {
    private static ArrayList<TodoItem> todoList = new ArrayList<>();

    // CRUD -> CREATE, READ, UPDATE, DELETE, READ ALL
    public static void add(TodoItem todoItem) {
        todoList.add(todoItem);
    }

    //kerkimi sequencial
    public static TodoItem findById(long id) {
        for (TodoItem item : todoList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public static void print(TodoItem item) {
        System.out.printf("%3d. %s | DueDate: %s | Completed: %s | Importance: %s\n",
                item.getId(), item.getTitle(), item.getDueDate() == null ? "N/A" : item.getDueDate(),
                item.isCompleted() ? "✅" : "❌", item.getImportance()
        );
    }

    public static void printAll() {
        System.out.println("Todo List:");
        System.out.println("==============================");
        for (TodoItem item : todoList) {
            print(item);
//            item.print();
        }
        System.out.println("==============================");
        System.out.println("Total todos: " + todoList.size());
        System.out.println("==============================");

    }


}








