package model.enums;

public enum CategoryOfRights {
    A("A"),

    B("B"),

    C("C");

    private String str;

    CategoryOfRights(String str) {

        this.str = str;
    }

    public String getStr(){

        return str;
    }


}
