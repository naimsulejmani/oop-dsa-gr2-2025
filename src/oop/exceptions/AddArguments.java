package oop.exceptions;

public class AddArguments {
    public static void main(String[] args) {
        String[] arguments1 = {"1", "2", "3"};
        String[] arguments2 = {"1", "foo", "2", "3","4"};
        addArgumentsGoodGood(arguments2);
        addArgumentsGoodGood(arguments1);

    }

    public static void addArgumentsBad(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Shuma eshte e barabarte me: " + sum);
    }

    public static void addArgumentsGood(String[] args) {
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Shuma eshte e barabarte me: " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Vlera e shtuar nuk eshte numer");
        }
    }

    public static void addArgumentsGoodGood(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            }
            catch (NumberFormatException ex) {
                System.out.println("Vlera e shtuar '" + arg + "' nuk eshte numer");
            }
        }
        System.out.println("Shuma eshte e barabarte me: " + sum);

    }


}








