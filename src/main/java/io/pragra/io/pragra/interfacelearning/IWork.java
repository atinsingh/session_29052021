package io.pragra.io.pragra.interfacelearning;
// in Java 8 Functional Interface
// A functional interface is an interface with only 1 abstract method

@FunctionalInterface
public interface IWork {
   void work();
   default void greet(){

   }
}
