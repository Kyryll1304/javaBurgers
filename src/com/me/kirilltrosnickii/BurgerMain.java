package com.me.kirilltrosnickii;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("булка", "м'ясо", "сир", "зелень", "майонез", true);
        Burger burger1 = new Burger("булка", "м'ясо", "сир", "зелень");
        Burger burger2 = new Burger("булка", "м'ясо", "сир", "зелень", "майонез", false);
    }
}

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String green;
    private String mayo;


    public Burger(String bun, String meat, String cheese, String green, String mayo, boolean doubleMeat) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        if (doubleMeat) {
            System.out.println("Склад подвійного бургера є " + bun + ",2 " + meat + ", " + cheese + ", " + green + ", " + mayo);
        } else {
            System.out.println("Склад звичайного бургера є " + bun + ", " + meat + ", " + cheese + ", " + green + ", " + mayo);
        }

    }

    public Burger(String bun, String meat, String cheese, String green) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = "";
        System.out.println("Склад диєтичного бургера є " + bun + ", " + meat + ", " + cheese + ", " + green);
    }


}