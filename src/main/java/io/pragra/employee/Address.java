package io.pragra.employee;

public class Address {
    private String streetName;
    private String city;

    public Address(String streetName, String city) {
        this.streetName = streetName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
