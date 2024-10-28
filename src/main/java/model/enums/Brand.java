package model.enums;

public enum Brand {

    AUDI("AUDI"),

    MERCEDES("MERCEDES"),

    BMW("BMW");

    private String str;

    Brand(String str) {

        this.str = str;
    }

    public String getStr(){

        return str;
    }

}
