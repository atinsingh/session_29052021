package io.pragra.employee;

public class MongoManager extends AweSomeDBManager{
    public MongoManager(String name) {
        super(name);
    }

    @Override
    public String getDbType() {
        return "MONGO";
    }


}
