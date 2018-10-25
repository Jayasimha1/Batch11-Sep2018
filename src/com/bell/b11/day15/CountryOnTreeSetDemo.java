package com.bell.b11.day15;

import java.util.*;

/*
        1. List family doesn't eliminate duplicates
        2. List family holds elements in insertion order
        3. Objects inside ArrayList/List can be sorted using Collections.sort(ObjectList,Criteira)
        4. Objects inside ArrayList/List can be sorted using Collections.sort(ObjectList) when that particular class implements comparable
        5. Set(HashSet) eliminates duplicates by using hashcode() & equals() method
        6. TreeSet naturally sorts objects along with eliminating duplicates, when either it implement Comparable interface(compareTo(Object o) method) or implement Comparator interface(compare(Object o1, Objecto2))
        countries  = new TreeSet<>(new NamedBasedCriteria());

        7. compareTo() or compare() both return int(either 0. -1, 1). In the implementation, if you use this.getName().compareTo(o.getName()) then the result will be in asending order and viceversa.
        8. For every primitve there will be equivalent Wrapper class*/

public class CountryOnTreeSetDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Count, please");
        int count = scan.nextInt();
        System.out.println("Provide the criteria");
        String click = scan.next();
        List<Country> countries = null;

        // Comparator Sorting based on click
       /* Set<Country> countries = null;
          if(click.equals("name")){
            countries  = new TreeSet<>(new NamedBasedCriteria());
        }else if(click.equals("gdp")){
            countries  = new TreeSet<>(new GDPBasedCriteria());
        }*/
       countries = new ArrayList<>();


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

        Collections.sort(countries);

        for(Country c:countries){
            System.out.println(c);
        }


    }
}
