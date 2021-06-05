package io.pragra.io.pragra.interfacelearning;

//@FunctionalInterface
//interface Accept{
//    void accept(Object obj);
//}


import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Line 11");
        System.out.println("Line 12");
        System.out.println("Line 13");
        System.out.println("Line 14");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Key In user");
            String name = scanner.nextLine();
            if(name.length()<4){
                throw new UserNameNotValidException("User Name should be at least 6 chars");
            }

        }catch (ArithmeticException ex){
            System.out.println(ex.getCause());
            System.out.println("Exception handled");
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
            System.out.println("Handled");
        }
        finally {
            System.out.println("Executed finally");
        }
        System.out.println("Line 17");
        System.out.println("Line 18");
    }
}

class Bank {
    void doSomething(){
        System.out.println("A");
        System.out.println(2/0);
        System.out.println("B");
    }
}


