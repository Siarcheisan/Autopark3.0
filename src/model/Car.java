package model;

import model.enums.Brand;
import model.enums.Color;


public class Car {
    private Brand brand;
    private int year;
    private Color color;
    private String stateNumber;
    private String vinCod;

    public Brand getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public String getVinCod() {
        return vinCod;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setVinCod(String vinCod) {
        this.vinCod = vinCod;
    }

    public String toString() {
        return this.getBrand() + ", " + this.getColor() + ", " + this.getYear();

    }



}
