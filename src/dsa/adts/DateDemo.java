package dsa.adts;

public class DateDemo {
    public static void main(String[] args) {
        Date dt1 = new Date(2006, 7, 21);
        String dateString = dt1.toString();
        System.out.println(dateString);

        Date dt2 = new Date(2006, 7, 21);
        Date dt3 = new Date("2008-02-17");

        System.out.println(dt2.toString());
        System.out.println(dt3);


        System.out.println(dt1.compareTo(dt2));

        System.out.println(dt1.equals(dt2));


    }
}
