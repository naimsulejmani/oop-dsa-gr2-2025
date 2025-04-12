package oop.arrays_example.mini_project;

import java.time.LocalDate;

public class TodoApp {
    public static void main(String[] args) {
        TodoItem todo1 = new TodoItem("Learn Basic Java");
        TodoItem todo2 = new TodoItem("Learn OOP", LocalDate.of(2025, 6, 30),
                TodoImportance.HIGH);
        TodoItem todo3 = new TodoItem("Learn DSA", TodoImportance.MEDIUM);

        TodoService.add(todo1);
        TodoService.add(todo2);
        todo3.changeStatus();
        TodoService.add(todo3);

        TodoService.printAll();


//        todo1.setCompleted(true);
//        todo2.changeStatus();
//        todo2.changeStatus();
//        System.out.println(todo1);
//        System.out.println(todo2);
//        System.out.println(todo3);
    }
}
