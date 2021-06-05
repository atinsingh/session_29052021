package io.pragra.io.pragra.interfacelearning;

public interface Play {
    int counter = 20;  // Automatically this will be
                      // public static final
    // Default implementation of method
    default void play() {
        System.out.println("Default Implementation");
    }


    static String greetMe(){
        return "Hi, How are you";
    }


}
