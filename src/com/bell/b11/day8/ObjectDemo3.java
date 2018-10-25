package com.bell.b11.day8;

import java.util.Objects;

public class ObjectDemo3 {

    public static void main(String[] args){

        Address e1Address = new Address("glen dr",323,20166);

        Employee e1 = new Employee(12, "Malli", "Dev",e1Address);

        Address e2Address = new Address("westwinds", 101, 20148);

        Employee e2 = new Employee(12, "Malli","Dev", e2Address);

        if(e2.equals(e1)){
            System.out.println(e2.hashCode());
            System.out.println(e1.hashCode());
            System.out.println("same");
        }else{
            System.out.println(e2.hashCode());
            System.out.println(e1.hashCode());
            System.out.println("not same");
        }




    }

}

class Employee{
    private int id;
    private String name;
    private String designation;
    private Address address;

    public Employee(int id, String name, String designation, Address address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}


class Address{

    private String street;
    private int houseNo;
    private int zip;

    public Address(String street, int houseNo, int zip) {
        this.street = street;
        this.houseNo = houseNo;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNo == address.houseNo &&
                zip == address.zip &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {

        return Objects.hash(street, houseNo, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNo=" + houseNo +
                ", zip=" + zip +
                '}';
    }
}

