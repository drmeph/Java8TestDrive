package com.drmeph.java8testdrive;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kevin.dorfer on 2/1/2018.
 *
 * This compares the implementation of a sort method with java 7 & 8
 */
public class Sorter {

    public static void main(String args[]) {

        List<String> names1 = new ArrayList<>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Sorter sorter = new Sorter();
        System.out.println("Sort using java 7 : ");

        Instant start = Instant.now();
        sorter.sortUsingJava7(names1);
        Instant end = Instant.now();

        System.out.println(names1 + " - duration = " + Duration.between(start, end));

        System.out.println("Sort using java 8 :");

        start = Instant.now();
        sorter.sortUsingJava8(names2);
        end = Instant.now();

        System.out.println(names2 + " - duration = " + Duration.between(start, end));
    }

    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, ((s, t1) -> s.compareTo(t1)));
    }
}
