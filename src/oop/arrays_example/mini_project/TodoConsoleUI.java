package oop.arrays_example.mini_project;

import java.time.LocalDate;
import java.util.Scanner;

public class TodoConsoleUI {
    public static void showMenu() {
        System.out.println("Zgjedh njeren nga menyte:");
        System.out.println("--------------------------------");
        for (TodoMenu menu : TodoMenu.values()) {
            System.out.println(menu.ordinal() + ". " + menu);
        }
        System.out.println(" Cfaredo per dalje (EXIT)!");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TodoMenu selectedMenu = null;
        do {
            showMenu();
            int menuId = Integer.parseInt(reader.nextLine());

            if (menuId < 0 || menuId >= TodoMenu.values().length) {
                System.out.println("Zgjedhja eshte e gabuar, provoni perseri!");
                continue;
            }
            selectedMenu = TodoMenu.values()[menuId];

            switch (selectedMenu) {
                case ADD -> addTodo(reader);
                case MODIFY -> modifyTodo();
                case REMOVE -> removeTodo();
                case FIND -> findTodo(reader);
                case FIND_ALL -> findAllTodos();
                default -> System.out.println("Aplikacioni do te mbyllet!");
            }

        } while (selectedMenu != TodoMenu.EXIT);

        System.out.println("See you soon! Don't forget to do your tasks!");
    }

    private static void findAllTodos() {
        TodoService.printAll();
    }

    private static void findTodo(Scanner reader) {
        System.out.println("Ju keni zgjedhur te kerkoni nje todo!");
        System.out.println("Zgjedh njeren nga todo-te e meposhtme");
        TodoService.printAll();
        System.out.println("Shkruaj id e todo-se qe do te kerkoni:");
        long id = Long.parseLong(reader.nextLine());
        TodoItem todoItem = TodoService.findById(id);

        if (todoItem == null) {
            System.out.println("Todo me id " + id + " nuk u gjet!");
            return;
        }
        System.out.println("Todo me id " + id + " u gjet!");
        TodoService.print(todoItem);

    }

    private static void removeTodo() {

    }

    private static void modifyTodo() {

    }

    private static void addTodo(Scanner reader) {
        System.out.println("Ju keni zgjedhur te shtoni nje todo te re!");
        System.out.print("Shkruaj titullin e todo-se: ");
        String title = reader.nextLine();
        System.out.print("Shkruaj daten e todos (YYYY-MM-DD): ");
        String date = reader.nextLine();

        TodoItem todoItem = new TodoItem(title, LocalDate.parse(date));
        TodoService.add(todoItem);

    }
}













