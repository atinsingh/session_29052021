package io.pragra.employee;

public abstract class AweSomeDBManager {

    private String name;

    public AweSomeDBManager(String name) {
        this.name = name;
    }
    public AweSomeDBManager(){

    }

    public abstract String getDbType(); // abstract



    public void insert(Object obj) {
        if( getDbType().equalsIgnoreCase("MYSQL") ){
            System.out.println("Insert data in mysql");
        }
        if( getDbType().equalsIgnoreCase("ORACLE") ){
            System.out.println("Insert data in ORACLE");
        }
        if( getDbType().equalsIgnoreCase("MONGO") ){
            System.out.println("Insert data in MONGO");
        }
    }

    public void update(Object obj) {

    }

    public void delete(Object obj) {

    }

    public void read(Object obj) {

    }
}
