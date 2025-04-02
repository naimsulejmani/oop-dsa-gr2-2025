package oop.enums;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Menu[] menus = Menu.values();
        System.out.println(Arrays.toString(menus));
        System.out.println("Zgjidh njerne nga menyte: ");
        for (Menu menu : menus) {
            System.out.printf("%d per %s%n", menu.ordinal(), menu.toString());
        }
        System.out.println("-----------------------");
        System.out.println("Zgjidh menun si numer: ");
        Scanner reader = new Scanner(System.in);
        int menuId = reader.nextInt();
        if (menuId >= menus.length) {
            System.out.println("Out of range");
            return;
        }
        System.out.println("Ju keni zgjedhur: " + menus[menuId]);

        System.out.println("Zgjidh njeren nga menytet: ");
        for (Menu menu : menus) {
            System.out.printf("Shkruaj %s per eksporim te saj...%n", menu.toString());
        }
        reader.nextLine();
        String menuName = reader.nextLine().toUpperCase();

        Menu menu = Menu.valueOf(menuName);

        System.out.println("Ju keni zgjedhur: " + menu);

    }
}














