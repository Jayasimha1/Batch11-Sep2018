package com.bell.b11.day7;

public class Hospital {

    private String name;
    private int zipcode;

    public Hospital() {
    }

    public Hospital(String name, int zipcode) {
        this.name = name;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
