package oop.class_summary;

public class CounterDemo {
    public static void main(String[] args) {
        Counter golaReali = new Counter();
        Counter golaBarcelona = new Counter();
        Counter provimetEKaluara = new Counter();
        Counter nrStudentevePjesmarres = new Counter();
        var tespih = new Counter();

        golaBarcelona.increment();
        golaBarcelona.increment();
        golaBarcelona.increment();
        golaBarcelona.increment();

        Counter titujReali = new Counter();


        System.out.println("Gola e Barcelones: " + golaBarcelona.getCount());
        System.out.println("Gola e Realit: " + golaReali.getCount());



        Counter saFatura = new Counter();
        saFatura.increment();
        saFatura.increment();
        saFatura.increment();
        System.out.println("Sa fatura jane bere: " + saFatura.getCount());


    }
}








