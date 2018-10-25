package com.bell.b11.day15;

import java.util.Objects;

public class Country implements Comparable<Country> {
    String name;
    int population;
    double gdp;

    public Country(String name, int population, double gdp) {
        this.name = name;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public int compareTo(Country o) {
        return o.getPopulation()-this.getPopulation();
    }
}
