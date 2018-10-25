package com.bell.b11.day12;

import java.util.Objects;
import java.util.Scanner;

public class HeightPaidEmployeeDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of employees");
        int count  = scan.nextInt();

        Employee[] empArray = new Employee[count];
        Employee emp =null;

        for(int i=0; i<count; i++){
            System.out.println("Enter Employee "+ i+" details");
            System.out.println("Enter id");
            int id = scan.nextInt();
            System.out.println("Enter name");
            String name = scan.next();
            System.out.println("Enter salary");
            double salary = scan.nextDouble();

            emp = new Employee(id, name, salary);
            empArray[i] = emp;

        }

        double highestSalary =0;
        String name =null;
        for(Employee emp1: empArray){
            if(highestSalary<emp1.getSalary()){
                highestSalary = emp1.getSalary();
                name = emp1.getName();
            }
        }

        System.out.println(name + " is the heighest salary in the company and getting "+highestSalary);



    }


}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, salary);
    }
}