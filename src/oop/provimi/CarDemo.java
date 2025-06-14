package oop.provimi;

public class CarDemo {
    public static void main(String[] args) {
//        Car audi = new Car("WAUZZZ8V3AA123456", "Audi A4", 50, 30000.0, "Black");
//        Car bemve = new Car("WAUZZZ8V3AA123456", "BMW 3", 50, 30000.0, "Black");
//
//        audi.increasePrice(10.0);
//        bemve.increasePrice(10.0);
//
//        System.out.println(audi.toString());
//        System.out.println(bemve.toString());

        Tire tire1 = new Tire(TireType.WINTER, 17, "Michelin");
        Tire tire2 = new Tire(TireType.SUMMER, 18, "Pirelli");
        Tire tire3 = new Tire(TireType.ALL_SEASON, 16, "Goodyear");
        Tire tire4 = new Tire(TireType.WINTER, 17, "Continental");
        Tire tire5 = new Tire(TireType.SUMMER, 18, "Dunlop");
        Tire[] tires1 = new Tire[]{
                tire1, tire2, tire3, tire4
        };
        Tire[] tires2 = new Tire[]{
                tire1, tire2, tire3, tire4, tire5
        };


        try {
            Car audi = new Car("WAUZZZ8V3AA123456", "Audi A4", 50, 30000.0, "Black", tires1);
            Car bemve = new Car("WAUZZZ8V3AA123456", "BMW 3", 50, 30000.0, "Black", tires2);

            audi.increasePrice(10.0);
            bemve.increasePrice(10.0);

            System.out.println(audi.toString());
            System.out.println(bemve.toString());
        } catch (SomeWheelsNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }
}
