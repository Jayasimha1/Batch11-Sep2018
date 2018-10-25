package com.bell.b11.day15;

import java.util.Comparator;

public class GDPBasedCriteria implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return Double.valueOf(o1.getGdp()).compareTo(Double.valueOf(o2.getGdp()));
    }
}
