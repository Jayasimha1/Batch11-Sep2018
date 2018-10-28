package com.bell.b11.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CollectionDemo {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Bujji",2.5,20);
        Doctor d2 = new Doctor("Malli",3.5,15);
        Doctor d3 = new Doctor("Kumar",3.5,20);
        Doctor d4 = new Doctor("Suresh",4.0,12);
        Doctor d5 = new Doctor("Simha",3.0,20);
        Doctor d6 = new Doctor("Venkat",3.0,25);
        Doctor d7 = new Doctor("Sundeep",2.5,10);
        Doctor d8 = new Doctor("Vinod",3.5,40);
        Doctor d9 = new Doctor("Siva",3.5,22);
        Doctor d10 = new Doctor("Ruthvik",3.0,23);

        ArrayList<Doctor> docList1 = new ArrayList<>();
        docList1.add(d1);
        docList1.add(d2);
        ArrayList<Doctor> docList2 = new ArrayList<>();
        docList2.add(d3);
        docList2.add(d4);
        ArrayList<Doctor> docList3 = new ArrayList<>();
        docList3.add(d5);
        docList3.add(d6);
        ArrayList<Doctor> docList4 = new ArrayList<>();
        docList4.add(d7);
        docList4.add(d8);
        ArrayList<Doctor> docList5 = new ArrayList<>();
        docList5.add(d9);
        docList5.add(d10);


        Service s1 = new Service("Cardio", docList1);
        Service s2 = new Service("Pharmasist", docList2);
        Service s3 = new Service("Gyno", docList3);
        Service s4 = new Service("Neuro",docList4);
        Service s5 = new Service("Dermotology",docList5);

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

        //System.out.println(h1);



        System.out.println("Which service you looking for, ");
        Scanner scan  = new Scanner(System.in);
        String serviceLookingFor = scan.next();

        for(Hospital h: hosList){

           ArrayList<Service> hServices =  h.getServices();
           // System.out.println(hServices);
           for(Service s: hServices){
               if(s.getSname().equalsIgnoreCase(serviceLookingFor)){
                   List<Doctor> dList = s.getDoctors();
                   Doctor bestDoctor = null;
                   double finalRatting =0;
                   for(Doctor d:dList){
                        if(d.getRating()*d.getReviews() >finalRatting){
                            finalRatting = d.getRating()*d.getReviews();
                            bestDoctor = d;
                       }

                   }
                   System.out.println(h.getName() + " is having the "+ s.getSname()+" service you looking for,"+ bestDoctor+" please contact 7739457884");
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
    ArrayList<Doctor> doctors;

    public Service(String sname, ArrayList<Doctor> doctors) {
        this.sname = sname;
        this.doctors = doctors;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(sname, service.sname) &&
                Objects.equals(doctors, service.doctors);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sname, doctors);
    }

    @Override
    public String toString() {
        return "Service{" +
                "sname='" + sname + '\'' +
                ", doctors='" + doctors + '\'' +
                '}';
    }
}

class Doctor{
    String drname;
    double rating;
    int reviews;

    public Doctor(String drname, double rating, int reviews) {
        this.drname = drname;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return rating == doctor.rating &&
                reviews == doctor.reviews &&
                Objects.equals(drname, doctor.drname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(drname, rating, reviews);
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "drname='" + drname + '\'' +
                ", rating=" + rating +
                ", reviews=" + reviews +
                '}';
    }
}