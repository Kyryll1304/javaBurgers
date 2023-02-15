package com.me.kirilltrosnickii;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("булка", "м'ясо", "сир", "зелень", "майонез");
        Burger burger1 = new Burger("булка", "м'ясо", "сир", "зелень");
        Burger burger2 = new Burger("булка", "м'ясо", "сир", "зелень", "майонез", 2);
    }
}

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String green;
    private String mayo;
    private int id;

    public Burger(String bun, String meat, String cheese, String green, String mayo) {
        this.id = 0;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        System.out.println("Склад звичайного бургера є " + bun + ", " + meat + ", " + cheese + ", " + green + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String green) {
        this.id = 1;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = "";
        System.out.println("Склад диєтичного бургера є " + bun + ", " + meat + ", " + cheese + ", " + green);
    }

    public Burger(String bun, String meat, String cheese, String green, String mayo, int meatAmount) {
        this.id = 2;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        if (meatAmount == 2) {
            System.out.println("Склад подвійного бургера є " + bun + ", " + meat + ", " + meat + ", " + cheese + ", " + green + ", " + mayo);
        }
    }


}