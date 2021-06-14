package com.poi.main;

import java.util.ArrayList;
import java.util.List;

public class DaftarKata {
    private String kata;
    private List<DaftarHuruf> Huruf = new ArrayList<>();

    public DaftarKata(String kata) {
        this.kata = kata;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }
    @Override
    public String toString(){
        return kata;
    }
}
