package com.bell.b11.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CollectionDemo {

    public static void main(String[] args) {
        Service s1 = new Service("Cardio", "Bujji");
        Service s2 = new Service("Pharmasist", "Rajshekar");
        Service s3 = new Service("Gyno", "Kumar");
        Service s4 = new Service("Neuro","Vinod");
        Service s5 = new Service("Dermotology","Malli");

        ArrayList<Service> al1 = new ArrayList<>();
        al1.add(s1);
        al1.add(s3);
        al1.add(s5);
        ArrayList<Service> al2 = new ArrayList<>();
        al2.add(s1);
        al2.add(s2);
        al2.add(s5);
        ArrayList<Service> al3 = new ArrayList<>();
        al3.add(s2);
        al3.add(s3);
        al3.add(s4);


        Hospital h1 = new Hospital("Childrens",al2);
        Hospital h2 = new Hospital("Nims",al1);
        Hospital h3 = new Hospital("Apollo",al3);


        ArrayList<Hospital> hosList = new ArrayList<>();
        hosList.add(h1);
        hosList.add(h2);
        hosList.add(h3);


        System.out.println("Which service you looking for, ");
        Scanner scan  = new Scanner(System.in);
        String serviceLookingFor = scan.next();

        for(Hospital h: hosList){

           ArrayList<Service> hServices =  h.getServices();
            System.out.println(hServices);
           for(Service s: hServices){
               if(s.getSname().equalsIgnoreCase(serviceLookingFor)){
                   System.out.println(h.getName() + " is having the service you looking for, please contact 7739457884");
               }
           }

        }


    }
}


class Hospital{
    String name;
    ArrayList<Service> services;


    public Hospital(String name, ArrayList<Service> services) {
        this.name = name;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(name, hospital.name) &&
                Objects.equals(services, hospital.services);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, services);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", services=" + services +
                '}';
    }
}

class Service{
    String sname;
    String drName;

    public Service(String sname, String drName) {
        this.sname = sname;
        this.drName = drName;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(sname, service.sname) &&
                Objects.equals(drName, service.drName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sname, drName);
    }

    @Override
    public String toString() {
        return "Service{" +
                "sname='" + sname + '\'' +
                ", drName='" + drName + '\'' +
                '}';
    }
}