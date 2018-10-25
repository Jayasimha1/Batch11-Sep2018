package com.bell.b11.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,Movie> netflix = new HashMap<>();
        Movie m1 = new Movie("Breaking Bad", 100000,109989889.22, 2010, "Thriller");
        Movie m2 = new Movie("Narco", 10000990,10994342329.22, 2015, "Crime");
        Movie m3 = new Movie("Spectral", 1003232000,10998889.22, 2010, "Scifi");
        Movie m4 = new Movie("GOT", 10000000,10954549889.22, 2008, "Action");

        netflix.put(m1.getName(),m1);
        netflix.put(m2.getName(),m2);
        netflix.put(m3.getName(),m3);
        netflix.put(m4.getName(),m4);


        //System.out.println(netflix);

        System.out.println(netflix.get("Breaking Bad"));

        Set<String> keys = netflix.keySet();

        for(String s:keys){
            System.out.println(s + "**** Movie Details Are ***** "+ netflix.get(s));
            System.out.println();
        }

        //Another way of iterating data from Map family

        for(Map.Entry<String, Movie> e:netflix.entrySet()){
            System.out.println(e.getKey() + "*************** " +e.getValue());
        }


    }

}


class Movie {
    String name;
    int budget;
    double collection;
    int year;
    String genre;

    public Movie(String name, int budget, double collection, int year, String genre) {
        this.name = name;
        this.budget = budget;
        this.collection = collection;
        this.year = year;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public double getCollection() {
        return collection;
    }

    public void setCollection(double collection) {
        this.collection = collection;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return budget == movie.budget &&
                Double.compare(movie.collection, collection) == 0 &&
                Double.compare(movie.year, year) == 0 &&
                Objects.equals(name, movie.name) &&
                Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, budget, collection, year, genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", collection=" + collection +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}