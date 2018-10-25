package com.bell.b11.day15;

import java.util.*;

public class CountryOnHashSetDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Count, please");
        int count = scan.nextInt();

        Set<Country> countries = new HashSet<>();
        Country country = null;

        for(int i=0;i<count; i++){
            System.out.println("Provide Country name");
            String name = scan.next();

            System.out.println("Provide population");
            int pop = scan.nextInt();

            System.out.println("Provide gdp");
            double gdp = scan.nextDouble();

            country = new Country(name, pop, gdp);
            countries.add(country);
        }


        for(Country c:countries){
            System.out.println(c);
        }


    }
}
