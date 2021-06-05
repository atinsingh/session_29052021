package io.pragra.io.pragra.interfacelearning;

public abstract class AbstractWork {
    int workingHours = 40; // instance variable
    static final int w = 0;

    public AbstractWork() {
    }

    public void work(){
        System.out.println("Enjoys working");
    }
    public abstract void moreWork();
}
