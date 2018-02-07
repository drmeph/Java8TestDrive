package com.drmeph.java8testdrive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin.dorfer on 2/5/2018.
 */
public class MethodReferenceTester {

    public static void main(String[] args) {
        List names = new ArrayList() {{
            add("David");
            add("Alexis");
            add("Michael");
            add("Rajiv");
            add("Jeff");
        }};

        //static method reference
        names.forEach(System.out::println);
    }

    /*
     * TODO
     * Reference to a constructor
     * Reference to an instance method of an arbitrary object of a particular type
     * Reference to an instance method of a particular object
     */
}
