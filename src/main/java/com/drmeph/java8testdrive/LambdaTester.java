package com.drmeph.java8testdrive;

/**
 * Created by kevin.dorfer on 2/5/2018.
 */
public class LambdaTester {

    final  static String salutation = "Hello! ";

    public static void main(String[] args) {

        LambdaTester tester = new LambdaTester();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //without type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetingService1 = message -> System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        //with final variable
        GreetingService greetingService3 = message -> System.out.println(salutation + message);

        greetingService1.sayMessage("Kevin");
        greetingService2.sayMessage("David");
        greetingService3.sayMessage("Tonton");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
