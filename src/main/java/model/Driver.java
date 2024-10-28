package model;

import model.enums.CategoryOfRights;

public class Driver {
    private String fio;
    private int age;
    private int drivingExperience;
    private CategoryOfRights categoryOfRights;

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public CategoryOfRights getCategoryOfRights() {
        return categoryOfRights;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void setCategoryOfRights(CategoryOfRights categoryOfRights) {
        this.categoryOfRights = categoryOfRights;
    }

    public String toString() {
        return this.getFio() + ", " + this.getAge() + ", " + this.getCategoryOfRights();

    }

}
