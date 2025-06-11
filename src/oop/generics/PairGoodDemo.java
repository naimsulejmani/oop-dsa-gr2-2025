package oop.generics;

import dsa.arrays_example.ArrayListDemo;
import oop.associations.ushtrime.Student;

import java.util.ArrayList;

public class PairGoodDemo {
    public static void main(String[] args) {
        PairGood<String, Double> pair1 = new PairGood<>("Avdiu", 1000.0);
        PairGood<String, Integer> pair2 = new PairGood<>("Rion", 20);
        PairGood<Integer, String> pair3 = new PairGood<>(20, "Barcelona");
        PairGood<String, String> pair4 = new PairGood<>("Grua","Burre");
        PairGood<String, Student> pair5 = new PairGood<>("STUDENT_MA_I_MIRE",
                new Student(1L,"Vjosa","Qorri"));

        ArrayList<PairGood<Pair<Integer>,PairGood<Integer,String>>> pairs = new ArrayList<>();
        pairs.add(
                new PairGood<>(
                        new Pair<>(1,2),
                        new PairGood<>(3,"Tre")
                )
        );

    }
}
