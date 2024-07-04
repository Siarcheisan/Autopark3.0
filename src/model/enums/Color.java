package model.enums;

public enum Color {
    YELLOW("yellow"),

    BLUE("blue"),

    BLACK("black");

    private String str;

    Color(String str) {
        this.str = str;
    }

    public String getStr(){
        return str;
    }



}
