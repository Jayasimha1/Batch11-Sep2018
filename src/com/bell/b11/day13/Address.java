package com.bell.b11.day13;

import java.util.Objects;

public class Address {

    int hNo;
    String Street;
    int zipCode;

    public Address(int hNo, String street, int zipCode) {
        this.hNo = hNo;
        Street = street;
        this.zipCode = zipCode;
    }

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return hNo == address.hNo &&
                zipCode == address.zipCode &&
                Objects.equals(Street, address.Street);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hNo, Street, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "hNo=" + hNo +
                ", Street='" + Street + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
