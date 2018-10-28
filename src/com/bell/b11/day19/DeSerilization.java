package com.bell.b11.day19;

import java.io.*;

public class DeSerilization {

    public static void main(String[] args) {
        String fileName = "somefile.txt";
        String absPath = System.getProperty("user.dir");
        System.out.println(absPath);
        String fullPath = absPath+ File.separator+fileName;
        System.out.println(fullPath);

        WebSite w1 = new WebSite();

        try(FileInputStream fis = new FileInputStream(fullPath);
            ObjectInputStream ois = new ObjectInputStream(fis)){

            w1 = (WebSite) ois.readObject();
            System.out.println(w1);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}


