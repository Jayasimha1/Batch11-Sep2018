package com.bell.b11.day19;

import java.io.*;
import java.util.Objects;

public class SerializationExample {

    public static void main(String[] args) {

        String fileName = "somefile.txt";
        String absPath = System.getProperty("user.dir");
        System.out.println(absPath);
        String fullPath = absPath+ File.separator+fileName;
        System.out.println(fullPath);

        WebSite w = new WebSite("Google",1,"Searching");

        try(FileOutputStream fos = new FileOutputStream(fullPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);){

            oos.writeObject(w);
            oos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

class WebSite implements Serializable{

    private String name;
    private int rank;
    private String purpose;

    public WebSite(){

    }
    public WebSite(String name, int rank, String purpose) {
        this.name = name;
        this.rank = rank;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSite webSite = (WebSite) o;
        return rank == webSite.rank &&
                Objects.equals(name, webSite.name) &&
                Objects.equals(purpose, webSite.purpose);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, rank, purpose);
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}