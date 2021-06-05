package io.pragra.employee;

public class MongoManager extends AweSomeDBManager{
    public MongoManager(String name) {
        super(name);
    }

    @Override
    public String getDbType() {
        return "MONGO";
    }

    public static void main(String[] args) {
        String apple = "apple";
        String oranges = new String("apple");

        System.out.println(oranges==apple);
    }


}
